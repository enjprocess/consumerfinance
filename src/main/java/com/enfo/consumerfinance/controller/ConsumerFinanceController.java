package com.enfo.consumerfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeBackConsumerModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.model.ReturnedData;
import com.enfo.consumerfinance.model.TunpostwantConsumer;
import com.enfo.consumerfinance.service.IConsumerFinanceService;
import com.enfo.consumerfinance.util.NetworkUtil;
import com.enfo.consumerfinance.util.Request;

@Controller
public class ConsumerFinanceController {

    @Autowired
    private IConsumerFinanceService consumerFinanceService;

    /**
     * 同步信托计划
     */
    @RequestMapping(value = "/SyncIntrustPlan", method = RequestMethod.POST)
    @ResponseBody
    public Object getProductConsumer(String product_code)
            throws Exception {
        ProductConsumerModel pcm = consumerFinanceService.getProductConsumer(product_code);
        
        if (null == pcm) {
            return new ReturnedData(false, 500, "查询不到记录!");
        } 
        
       
        
        
        return pcm;
    }

    /**
     * 发起放款审批流程
     */
    @RequestMapping(value = "/LoanApproval", method = RequestMethod.POST)
    @ResponseBody
    public ReturnedData addInvestchangeConsumer(InvestchangeConsumerModel icm)
            throws Exception {
        return consumerFinanceService.addInvestchangeConsumer(icm);
    }

    /**
     * 放款确认
     */
    @RequestMapping(value = "/depositConfirm", method = RequestMethod.POST)
    @ResponseBody
    public ReturnedData depositConfirm(Integer problem_id, @RequestParam(value = "input_man", required = false, defaultValue = "0") Integer input_man) throws Exception {
       
        try {
            //从业务系统查出需要发送给消金系统的数据
            DepositConfirmModel depositConfirmModel = consumerFinanceService
                    .getInvestchangeCheck(problem_id);
            
            Request request = new Request();
           
            //调用消金的接口
            
            if (null == depositConfirmModel) {
                return new ReturnedData(false, 500, "没有查询到任何记录!");
            }
            
            request.setMER_ID(depositConfirmModel.getOrg_code());
            request.setLOAN_DATE(depositConfirmModel.getLoan_date());
            request.setCONTRACT_NUM(depositConfirmModel.getLoan_cont_no());
            
            String preparedSendData = NetworkUtil.constructJson(request);
            String returnedData = NetworkUtil.sendJson(preparedSendData);
            String resultCode = NetworkUtil.parseJson(returnedData);
            
            if("0000".equals(resultCode)) {
                //刷新状态
                consumerFinanceService.checkInvestchangeConsumer(problem_id, input_man);
            }
            
        } catch (Exception e) {
            return new ReturnedData(false, 500, "调用接口失败,失败信息如下：" + e.getMessage());
        }
        
        return new ReturnedData(true, 200, "调用接口成功!");
    }

    /**
     * 还款流程
     */
    @RequestMapping(value = "/Reimbursement", method = RequestMethod.POST)
    @ResponseBody
    public ReturnedData addInvestchangeBackConsumer(
            InvestchangeBackConsumerModel ibcm) throws Exception {

        return consumerFinanceService.addInvestchangeBackConsumer(ibcm);
    }

    /**
     * 会计并账
     */
    @RequestMapping(value = "/AccountingConsolidation", method = RequestMethod.POST)
    @ResponseBody
    public ReturnedData addTunpostwantConsumer(TunpostwantConsumer tc)
            throws Exception {
        return consumerFinanceService.addTunpostwantConsumer(tc);
    }

}
