package com.hcl.modelbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.modelbank.dto.UserReqDTO;
import com.hcl.modelbank.dto.UserResDTO;
import com.hcl.modelbank.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class LoginController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<String> userLogin(@RequestBody UserReqDTO userReqDTO){
		
		String message= userService.customerLogin(userReqDTO.getCustomerId(),userReqDTO.getPassword());
	   return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
