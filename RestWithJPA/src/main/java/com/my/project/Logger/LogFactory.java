package com.my.project.Logger;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogFactory
{
	public static Logger getLogger(Class classInfo)
	{
		InetAddress client = null;
		try {
			client = java.net.Inet4Address.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(client != null)
		 MDC.put("IP", client.toString()); 
		
		Logger logger = LoggerFactory.getLogger(classInfo);
		return logger;
	}

}
