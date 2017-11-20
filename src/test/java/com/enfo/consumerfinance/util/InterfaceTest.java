package com.enfo.consumerfinance.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InterfaceTest {

    private Request request;

    @Before
    public void setup() {

        request = new Request();
        request.setMER_ID("20000000");
        request.setLOAN_DATE("2017-10-13");
        request.setCONTRACT_NUM("BQXFDKD-FKZLH171013");
    }

    /**
     * 测试能否用gson构造出正确的json字符串
     */
    @Test
    public void testConstructJson() throws Exception {

        String ret = NetworkUtil.constructJson(request);

        String expected = "{\"SERVICE\":{\"SERVICE_HEADER\":{\"SERVICE_ID\":\"GrantLoan\",\"ORG\":\"6440\","
                + "\"CHANNEL_ID\":\"BANK\",\"ACQ_ID\":\"20000061\",\"SUB_TERMINAL_TYPE\":\"APP\","
                + "\"SERVICESN\":\"zz20171209100467\",\"REQUEST_TIME\":\"20161209100409\",\"VERSION_ID\":\"01\"},"
                + "\"SERVICE_BODY\":{\"REQUEST\":{\"MER_ID\":\"20000000\",\"LOAN_DATE\":\"2017-10-13\","
                + "\"CONTRACT_NUM\":\"BQXFDKD-FKZLH171013\"}}}}";

        Assert.assertEquals(expected, ret);
    }

    /**
     * 测试json能否被正常解析
     */
    @Test
    public void testParseJson() throws Exception {

        String source = "{\"SERVICE\":{\"SERVICE_HEADER\":{\"SERVICE_ID\":\"GrantLoan\",\"ORG\":\"6440\","
                + "\"CHANNEL_ID\":\"BANK\",\"SUB_TERMINAL_TYPE\":\"APP\",\"REQUEST_TIME\":\"20161209100409\","
                + "\"VERSION_ID\":\"01\",\"SERV_RESPONSE\":{\"STATUS\":\"S\",\"CODE\":\"0000\",\"DESC\":\"交易成功\"}},"
                + "\"SERVICE_BODY\":{\"RESPONSE\":{\"MER_ID\":\"20000000\",\"LOAN_DATE\":\"2017-10-13\","
                + "\"ERRCODE\":\"00105\",\"ERRMESSAGE\":\"放款失败【没有这笔放款申请】\"}}}}";
        String code = NetworkUtil.parseJson(source);
        Assert.assertEquals(code, "0000");
    }

    /**
     * 测试json能否被正常的发到消金服务器端
     */
    @Test
    public void testSendJson() throws Exception {

        //这个是被测试通过了的
        String ret = NetworkUtil.constructJson(request);
        
        String result = NetworkUtil.sendJson(ret);
        
        //这个是被测试通过了的
        String code = NetworkUtil.parseJson(result);
        Assert.assertEquals(code, "0000");
    }

}
