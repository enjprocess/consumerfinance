package com.enfo.consumerfinance.service;

import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeBackConsumerModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.model.ReturnedData;
import com.enfo.consumerfinance.model.TunpostwantConsumer;

public interface IConsumerFinanceService {

 public ProductConsumerModel getProductConsumer(String product_code) throws Exception;
    
    public ReturnedData addInvestchangeConsumer(InvestchangeConsumerModel icm) throws Exception;
    
    public DepositConfirmModel getInvestchangeCheck(Integer problemId) throws Exception;

    public void checkInvestchangeConsumer(Integer problemId, Integer inputMan) throws Exception;
    
    public ReturnedData addInvestchangeBackConsumer(InvestchangeBackConsumerModel ibcm) throws Exception;
    
    public ReturnedData addTunpostwantConsumer(TunpostwantConsumer tc) throws Exception;
}
