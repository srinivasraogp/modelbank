package com.hcl.modelbank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.modelbank.dto.UserResponseDTO;
import com.hcl.modelbank.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class DisplayController {
	private Logger logger = LoggerFactory.getLogger(DisplayController.class);
	@Autowired
	UserService userService;

	@GetMapping("/summary/{accountNumber}")

	public ResponseEntity<UserResponseDTO> getAccountDetails(@PathVariable Long accountNumber) {
	
		UserResponseDTO userResponseDTO=userService.findByAccountNumber(accountNumber);
		logger.debug("{getAccountDetails}",accountNumber);
		return new ResponseEntity<>(userResponseDTO,HttpStatus.OK);
	
	

}
}