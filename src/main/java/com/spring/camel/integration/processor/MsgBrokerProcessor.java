package com.spring.camel.integration.processor;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MsgBrokerProcessor {

private static final Logger log = LoggerFactory.getLogger(MsgBrokerProcessor.class);
	
	public void process(Exchange exchange) throws Exception	{
		
		log.info("MsgBrokerProcessor process() enterying");
		log.info("MsgBrokerProcessor - exchangeID: " + exchange.getExchangeId());

		/*
		 * BrokerService broker = new BrokerService();
		 * broker.addConnector("tcp://localhost:61616"); 
		 * broker.start();
		 */ 
		
		log.info("MsgBrokerProcessor process() exiting");
	
	}
}
