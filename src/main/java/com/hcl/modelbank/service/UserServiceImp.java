package com.hcl.modelbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.modelbank.dto.UserResDTO;
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
		
}


