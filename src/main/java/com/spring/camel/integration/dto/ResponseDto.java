package com.spring.camel.integration.dto;

import lombok.Data;

@Data
public class ResponseDto {

	private String respCode;
	private String respMsg;
	private String errorCode;
	private String errorMsg;
	
}
