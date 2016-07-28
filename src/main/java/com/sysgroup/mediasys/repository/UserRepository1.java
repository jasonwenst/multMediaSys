package com.sysgroup.mediasys.repository;

import org.springframework.data.repository.CrudRepository;

import com.sysgroup.mediasys.entity.UserEntity1;


public interface UserRepository1 extends CrudRepository<UserEntity1, Long> {
	
	UserEntity1 findUserEntityByUserName(String userName);
	
	
	UserEntity1 findUserEntityByUserNameAndPassword(String userName, String password);

}
