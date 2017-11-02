package com.enfo.consumerfinance.mapping.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.enfo.consumerfinance.dao.IConsumerFinanceDao;
import com.enfo.consumerfinance.model.DepositConfirmModel;
import com.enfo.consumerfinance.model.InvestchangeConsumerModel;
import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.enfo.consumerfinance.util.SqlSessionUtil;

public class ConsumerFinanceTest {

    SqlSession sqlSession = null;
    
    @Before
    public void setUp() throws Exception {
        sqlSession = SqlSessionUtil.getSqlSession();
    }
    
    @After
    public void tearDown() {
        sqlSession.close();
    }
    
    /**
     * 测试java客户端连接sqlserver服务端能否成功
     */
    @Test
    public void testJDBCIsValid() throws Exception {
        IConsumerFinanceDao ipcd = sqlSession.getMapper(IConsumerFinanceDao.class);
        ProductConsumerModel productConsumer = ipcd.getProductConsumer("17006");
        assertNotNull(productConsumer);
    }
    
    /**
     * 测试ProductConsumerModel是否已经取到数据
     */
    @Test
    public void testProductConsumerHaveData() throws Exception {
        IConsumerFinanceDao ipcd = sqlSession.getMapper(IConsumerFinanceDao.class);
        ProductConsumerModel productConsumer = ipcd.getProductConsumer("17006");
        System.out.println(productConsumer);
        assertArrayEquals(new int[]{1752}, new int[]{productConsumer.getProduct_id()});
    }
    
    /**
     * 测试AddInvestchangeConsumer方法是否能够抛出异常
     */
    @Test
    public void testAddInvestchangeConsumer()  {
        IConsumerFinanceDao ipcd = sqlSession.getMapper(IConsumerFinanceDao.class);
        InvestchangeConsumerModel icm = new InvestchangeConsumerModel(316, null, null, null, null, null, 888, null);
        try {
            ipcd.addInvestchangeConsumer(icm);
            fail("接口调用失败");
        } catch (Exception e) {
        }
    }
    
    /**
     * 测试getInvestchangeCheck方法是否能够调用成功
     */
    @Test
    public void testGetInvestchangeCheck()  {
        IConsumerFinanceDao ipcd = sqlSession.getMapper(IConsumerFinanceDao.class);
        try {
            DepositConfirmModel ret = ipcd.getInvestchangeCheck(0);
            System.out.println(ret);
            assertNotNull(ret);
        } catch (Exception e) {
            e.printStackTrace();
            fail("接口调用失败");
        }
    }
}
