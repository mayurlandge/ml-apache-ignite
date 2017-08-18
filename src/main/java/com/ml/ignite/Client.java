package com.ml.ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.communication.tcp.TcpCommunicationSpi;

public class Client {
	
	public static void main(String a[]) throws InterruptedException {
		// TODO Auto-generated method stub
		IgniteConfiguration cfg = new IgniteConfiguration();

		// Configure Ignite here.
		cfg.setClientMode(true);

		
		TcpCommunicationSpi commSpi = new TcpCommunicationSpi();
		commSpi.setSlowClientQueueLimit(1000);

		cfg.setCommunicationSpi(commSpi);
		Ignite ignite = Ignition.start(cfg);
		IgniteCache<String, String> ic =  ignite.createCache("ignite");
		for(int i=100000;i<100000000;i--){
			ic.put("mayur"+i, i+"");
			Thread.sleep(1000);
		}
	}

}
