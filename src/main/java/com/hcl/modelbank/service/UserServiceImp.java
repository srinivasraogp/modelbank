package com.hcl.modelbank.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.modelbank.dto.UserResponseDTO;
import com.hcl.modelbank.entity.User;
import com.hcl.modelbank.respository.UserRepository;

@Service
public class UserServiceImp implements UserService {
@Autowired
private UserRepository userRepository;
	


 @Override
	public String customerLogin(Long cust_id,String password) {
	 
	 User user=userRepository.login(cust_id, password);
	 
	 String messsage = null;
	 if(user==null){
		 messsage = "login is not successfull";
	 }else {
		 messsage = "login is successfull";
	 }
	 return messsage;
	 
	  
 }
 public UserResponseDTO findByAccountNumber(Long accountNumber) {
		User user=userRepository.findByAccountNumber(accountNumber);
		UserResponseDTO 		userResponseDTO = new UserResponseDTO();

		BeanUtils.copyProperties(user, userResponseDTO);
		return userResponseDTO;

		
	}
		
}


