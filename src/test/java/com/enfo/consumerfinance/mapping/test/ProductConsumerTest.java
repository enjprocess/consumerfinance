package com.enfo.consumerfinance.mapping.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.enfo.consumerfinance.dao.IProductConsumerDao;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.util.SqlSessionUtil;

public class ProductConsumerTest {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    /**
     * 测试java客户端连接sqlserver服务端能否成功
     */
    @Test
    public void testJDBCIsValid() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        IProductConsumerDao ipcd = sqlSession.getMapper(IProductConsumerDao.class);
        ProductConsumerModel productConsumer = ipcd.getProductConsumer("17006");
        assertNotNull(productConsumer);
        sqlSession.close();
    }
    
    
    @Test
    public void testGetProductConsumer() throws Exception {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        IProductConsumerDao ipcd = sqlSession.getMapper(IProductConsumerDao.class);
        ProductConsumerModel productConsumer = ipcd.getProductConsumer("17006");
        assertNotNull(productConsumer);
        sqlSession.close();
    }
}
