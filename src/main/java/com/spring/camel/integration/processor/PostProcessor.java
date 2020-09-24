package com.spring.camel.integration.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spring.camel.integration.constant.SpringCamelConstant;
import com.spring.camel.integration.dto.ResponseDto;

public class PostProcessor implements Processor {

private static final Logger log = LoggerFactory.getLogger(PostProcessor.class);
	
	public void process(Exchange exchange) throws Exception	{
		
		log.info("PostProcessor process() enterying");
		
		String msg = exchange.getIn().getHeader(SpringCamelConstant.HEADER_NIGHT_MSG, String.class);

		log.info("SecondRouteProcessor - exchangeID: " + exchange.getExchangeId());
		log.info("Msg: " + msg);
		
		ResponseDto resp = new ResponseDto();
		resp.setErrorCode("200");
		resp.setErrorMsg("SUCCESS");
		resp.setRespCode("200");
		resp.setRespMsg(msg);
		
		exchange.getIn().setAttachments(exchange.getIn().getAttachments());
		exchange.getIn().setBody(resp);

		log.info("PostProcessor process() removing exchange header");
		exchange.getIn().removeHeaders(SpringCamelConstant.HEADER + "*");
		
		msg = exchange.getIn().getHeader(SpringCamelConstant.HEADER_NIGHT_MSG, String.class);
		log.info("Msg: " + msg);
		
		log.info("PostProcessor process() exiting");
	}
}
