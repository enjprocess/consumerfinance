package com.enfo.consumerfinance.service.impl;

import java.sql.SQLException;

import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enfo.consumerfinance.dao.IConsumerFinanceDao;
import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeBackConsumerModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.model.ReturnedData;
import com.enfo.consumerfinance.service.IConsumerFinanceService;

@Service
public class ConsumerFinanceServiceImpl implements IConsumerFinanceService {

    @Autowired
    private IConsumerFinanceDao consumerFinanceDao;
    
    @Override
    public ProductConsumerModel getProductConsumer(String product_code)
            throws Exception {
        ProductConsumerModel productConsumer = null;
       try {
           productConsumer = consumerFinanceDao.getProductConsumer(product_code);
           if (null == productConsumer) {
               productConsumer = new ProductConsumerModel();
           }
          
       } catch (Exception e) {
           //如果查询出来是多条记录的话，Mybatis会抛出SQLException 这里捕获处理下
           productConsumer = new ProductConsumerModel();
       }
       return productConsumer;
    }

    @Override
    public ReturnedData addInvestchangeConsumer(InvestchangeConsumerModel icm)
            throws Exception {
       ReturnedData rd = null;
       try {
           consumerFinanceDao.addInvestchangeConsumer(icm);
           rd = new ReturnedData(true, 200, "调用成功!");
       } catch (Exception ex) {
           ex.printStackTrace();
           rd = new ReturnedData(false, 500, "数据库异常!");
       }
       return rd;
    }

    @Override
    public DepositConfirmModel getInvestchangeCheck(Integer problemId)
            throws Exception {
        
        return null;
    }

    @Override
    public DepositConfirmModel checkInvestchangeConsumer(Integer problemId,
            Integer inputMan) throws Exception {
        return null;
    }

    @Override
    public ReturnedData addInvestchangeBackConsumer(InvestchangeBackConsumerModel ibcm)
            throws Exception {
        ReturnedData rd = null;
        try {
            consumerFinanceDao.addInvestchangeBackConsumer(ibcm);
            rd = new ReturnedData(true, 200, "调用成功!");
        } catch (Exception ex) {
            ex.printStackTrace();
            rd = new ReturnedData(false, 500, "数据库异常!");
        }
        return rd;
    }

}
