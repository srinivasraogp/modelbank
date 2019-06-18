package com.hcl.modelbank.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @NoArgsConstructor
public class ErrorResponse {

	private String message;
	
}
