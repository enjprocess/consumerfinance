package com.enfo.consumerfinance.controller.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class DepositConfirmTest {

    @Test
    public void testReturnedDataFromDepositConfirm() throws Exception {

       /* HttpURLConnection conn = (HttpURLConnection) (new URL(
                "http://128.8.18.123:8090/consumerfinance/depositConfirm")).openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type",
                "application/x-www-form-urlencoded");

        conn.setDoOutput(true);
        conn.setDoInput(true);

        OutputStream os = conn.getOutputStream();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("problem_id=" + 59685 + "&input_man=" + 0);
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

        System.out.println(sb.toString());*/
    }
}
