package com.sysgroup.mediasys.converter;

import org.springframework.util.StringUtils;

import com.sysgroup.mediasys.entity.UserEntity1;
import com.sysgroup.mediasys.model.User;

public class UserConverter {

	
	public static User convert(UserEntity1 entity) {
		
		User model = new User();
		model.setUsername(entity.getUserName());
		model.setAddress(entity.getAddress());
		model.setEmail(entity.getEmail());
		model.setId(entity.getId());
		model.setPassword(entity.getPassword());
		model.setSsoId(entity.getSsoId());
		return model;
		
		
	}
	
	public static UserEntity1 convertToEntity(User user) {
		UserEntity1 entity = new UserEntity1();
		entity.setUserName(user.getUsername());
		entity.setAddress(user.getAddress());
		entity.setEmail(user.getEmail());
		entity.setId(user.getId());
		entity.setPassword(user.getPassword());
		entity.setSsoId(StringUtils.isEmpty(user.getSsoId()) ? String.valueOf(System.currentTimeMillis()) : user.getSsoId() );
		return entity;
	}
}
