package com.enfo.consumerfinance.dao;

import java.sql.SQLException;

import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeBackConsumerModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.model.TunpostwantConsumer;

public interface IConsumerFinanceDao {

    public ProductConsumerModel getProductConsumer(String productCode) throws Exception;
    
    public void addInvestchangeConsumer(InvestchangeConsumerModel icm) throws Exception;
    
    public DepositConfirmModel getInvestchangeCheck(Integer problemId) throws Exception;

    public DepositConfirmModel checkInvestchangeConsumer(Integer problemId, Integer inputMan) throws Exception;
    
    public void addInvestchangeBackConsumer(InvestchangeBackConsumerModel ibcm) throws Exception;

    public void addTunpostwantConsumer(TunpostwantConsumer tc) throws Exception;
}
