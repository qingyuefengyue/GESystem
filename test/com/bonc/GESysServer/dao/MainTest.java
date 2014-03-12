package com.bonc.GESysServer.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainTest {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://192.168.1.114:8080/PalmBiServer/PalmBiKpi/palmBiSysFuncAction_queryrETLdetail.do?usercode=xiangzheng&imsi=460020392147625&imei=860173018709240&&password=C86038FE04BC7097E218B4FD6B767F4B");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		//connection.getInputStream() 调用该方法才正在意义上去取数据
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String s =null;
		while((s=reader.readLine())!=null){
			System.out.println(s);
		}
		reader.close();
		connection.disconnect();
	}
}
