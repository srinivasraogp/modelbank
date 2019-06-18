package com.hcl.modelbank.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.modelbank.dto.UserResponseDTO;
import com.hcl.modelbank.entity.User;
import com.hcl.modelbank.repository.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService{

	
	@Autowired 
	private UserRepository userRepository;
	

	
	public UserResponseDTO findByAccountNumber(Long accountNumber) {
		User user=userRepository.findByAccountNumber(accountNumber);
		UserResponseDTO 		userResponseDTO = new UserResponseDTO();

		BeanUtils.copyProperties(user, userResponseDTO);
		return userResponseDTO;

		
	}

}
