package com.spring.camel.integration.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spring.camel.integration.constant.SpringCamelConstant;

public class SecondRouteProcessor implements Processor	{
	
	private static final Logger log = LoggerFactory.getLogger(SecondRouteProcessor.class);
	
	public void process(Exchange exchange) throws Exception	{
		
		log.info("SecondRouteProcessor process() enterying");
		
		String msg = exchange.getIn().getHeader(SpringCamelConstant.HEADER_DAY_MSG, String.class);
		String body = exchange.getIn().getBody(String.class);

		log.info("SecondRouteProcessor - exchangeID: " + exchange.getExchangeId());
		log.info("Msg: " + msg);
		
		exchange.getIn().setHeader(SpringCamelConstant.HEADER_NIGHT_MSG, msg + new String(" Good Night ") + body);
		
		log.info("SecondRouteProcessor process() exiting");
	}
}
