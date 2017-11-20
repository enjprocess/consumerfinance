package com.enfo.consumerfinance.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class NetworkUtil {

    /**
     * 构造推送给消金的json数据
     */
    public static String constructJson(Request request) throws Exception {

        RequestJson rj = new RequestJson();
        Service service = new Service();
        ServiceHeader sh = new ServiceHeader();
        ServiceBody sb = new ServiceBody();
        
        sb.setREQUEST(request);
        
        sh.setSERVICE_ID("GrantLoan");
        sh.setORG("6440");
        sh.setCHANNEL_ID("BANK");
        sh.setACQ_ID("20000061");
        sh.setSUB_TERMINAL_TYPE("APP");
        sh.setSERVICESN("zz20171209100467");
        sh.setREQUEST_TIME("20161209100409");
        sh.setVERSION_ID("01");
        
        service.setSERVICE_HEADER(sh);
        service.setSERVICE_BODY(sb);
        
        rj.setSERVICE(service);
        
        Gson gson = new Gson();
        return gson.toJson(rj);
    }
    
    /**
     * 使用http发送json数据给消金
     */
    
    public static String sendJson(String content) throws Exception {
        URLConnection conn = new URL("http://140.207.39.250:17977/").openConnection();
        
        conn.setDoOutput(true);
        conn.setDoInput(true);
        
        OutputStream os = conn.getOutputStream();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write(content);
        bw.flush();
        
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while (null != (line = br.readLine())) {
            sb.append(line);
        }
        
        is.close();
        os.close();
        return sb.toString();
    }
    
    
    /**
     * 使用jsonObject解析消金返回的报文
     */
    
    public static String parseJson(String content) throws Exception {
        
        JSONObject obj = new JSONObject(content);
        JSONObject service = obj.getJSONObject("SERVICE");
        JSONObject serviceHeader = service.getJSONObject("SERVICE_HEADER");
        JSONObject servResponse = serviceHeader.getJSONObject("SERV_RESPONSE");
        String code = servResponse.getString("CODE");
        return code;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
