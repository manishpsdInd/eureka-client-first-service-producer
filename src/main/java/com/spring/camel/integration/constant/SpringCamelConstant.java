package com.spring.camel.integration.constant;

public class SpringCamelConstant {

	public static final String SPRING_CAMEL_ROUTER = "direct://SpringCamelRouter";
	public static final String NULL_ROUTE = null;
	public static final String BLANK_STRING = null;
	
	public static final String EXCEPTION = "direct://CamelIntegrationException";
	
	public static final String ROUTE_PRE_PROCESSOR = "direct://PreProcessorRoute";
	public static final String ROUTE_FIRST = "direct://firstRoute";
	public static final String ROUTE_SECOND = "direct://secondRoute";
	public static final String ROUTE_POST_PROCESSOR = "direct://PostProcessorRoute";
	
	public static final String HEADER = "HEADER_";
	public static final String HEADER_DAY_MSG = HEADER + "DayMsg";
	public static final String HEADER_NIGHT_MSG = HEADER + "NightMsg";
	
}
