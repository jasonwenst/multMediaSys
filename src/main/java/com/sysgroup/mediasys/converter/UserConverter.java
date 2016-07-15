package com.sysgroup.mediasys.converter;

import com.sysgroup.mediasys.entity.UserEntity;
import com.sysgroup.mediasys.model.User;

public class UserConverter {

	
	public static User convert(UserEntity entity) {
		
		User model = new User();
		model.setUsername(entity.getUserName());
		model.setAddress(entity.getAddress());
		model.setEmail(entity.getEmail());
		model.setId(entity.getId());
		model.setPassword(entity.getPassword());
		model.setSsoId(entity.getSsoId());
		return model;
		
		
	}
	
	public static UserEntity convertToEntity(User user) {
		UserEntity entity = new UserEntity();
		entity.setUserName(user.getUsername());
		entity.setAddress(user.getAddress());
		entity.setEmail(user.getEmail());
		entity.setId(user.getId());
		entity.setPassword(user.getPassword());
		entity.setSsoId(user.getSsoId());
		return entity;
	}
}
