package com.hcl.modelbank.service;

import com.hcl.modelbank.dto.UserResponseDTO;

public interface UserService {

	String customerLogin(Long cust_id,String password);

	UserResponseDTO findByAccountNumber(Long accountNumber);
	

}
