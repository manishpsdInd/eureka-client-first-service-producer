package com.spring.camel.integration.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class RequestDto {
	
	private @Getter String key;
	private @Getter String value;
	
	private @Setter String temp;

}
