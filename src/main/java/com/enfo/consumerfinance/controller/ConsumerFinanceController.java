package com.enfo.consumerfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeBackConsumerModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.model.ReturnedData;
import com.enfo.consumerfinance.model.TunpostwantConsumer;
import com.enfo.consumerfinance.service.IConsumerFinanceService;

@Controller
@RequestMapping("/consumerfinance")
public class ConsumerFinanceController {

    @Autowired
    private IConsumerFinanceService consumerFinanceService;
    
    @RequestMapping("/SyncIntrustPlan")
    @ResponseBody
    public ProductConsumerModel getProductConsumer(String product_code)
            throws Exception {
        return consumerFinanceService.getProductConsumer(product_code);
    }

    @RequestMapping("/LoanApproval")
    @ResponseBody
    public ReturnedData addInvestchangeConsumer(InvestchangeConsumerModel icm)
            throws Exception {
       return consumerFinanceService.addInvestchangeConsumer(icm);
    }

    public DepositConfirmModel getInvestchangeCheck(Integer problemId)
            throws Exception {
        
        return null;
    }

    public DepositConfirmModel checkInvestchangeConsumer(Integer problemId,
            Integer inputMan) throws Exception {
        return null;
    }

    @RequestMapping("/Reimbursement")
    @ResponseBody
    public ReturnedData addInvestchangeBackConsumer(InvestchangeBackConsumerModel ibcm)
            throws Exception {
        return consumerFinanceService.addInvestchangeBackConsumer(ibcm);
    }

    @RequestMapping("/AccountingConsolidation")
    @ResponseBody
    public ReturnedData addTunpostwantConsumer(TunpostwantConsumer tc)
            throws Exception {
        return consumerFinanceService.addTunpostwantConsumer(tc);
    }
    
}
