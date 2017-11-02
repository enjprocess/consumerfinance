package com.enfo.consumerfinance.dao;

import java.sql.SQLException;

import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;

public interface IConsumerFinanceDao {

    public ProductConsumerModel getProductConsumer(String productCode) throws Exception;
    
    public void addInvestchangeConsumer(InvestchangeConsumerModel icm) throws Exception;
    
    public DepositConfirmModel getInvestchangeCheck(Integer problemId) throws Exception;
}
