package com.enfo.consumerfinance.dao;

import com.enfo.consumerfinance.model.ProductConsumerModel;

public interface IProductConsumerDao {

    public ProductConsumerModel getProductConsumer(String productCode);
}
