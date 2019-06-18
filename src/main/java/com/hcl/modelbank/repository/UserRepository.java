package com.hcl.modelbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.modelbank.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value="select u from User u where u.customerId=:customerid AND u.password=:password ")
    User login(@Param ("customerid") long customerid ,@Param("password") String password);

	User findByAccountNumber(Long accountNumber);
}
