package com.hcl.modelbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.modelbank.dto.UserResponseDTO;
import com.hcl.modelbank.entity.*;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	User findByAccountNumber(Long accountNumber);

	

}
