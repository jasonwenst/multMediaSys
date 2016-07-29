package com.sysgroup.mediasys.converter;

import org.springframework.util.ObjectUtils;

import com.sysgroup.mediasys.entity.UserEntity;
import com.sysgroup.mediasys.model.User;

public class UserConverter {

	
	public static User convert(UserEntity entity) {
		
		User model = new User();
		model.setUsername(entity.getUserName());
		model.setId(entity.getUserId());
		model.setPassword(entity.getUserPasswd());
		model.setGroupId(ObjectUtils.isEmpty(entity.getTbUerGroup())? null : entity.getTbUerGroup().getGroupId());
		
		return model;
		
		
	}
	
	public static UserEntity convertToEntity(User user) {
		UserEntity entity = new UserEntity();
		entity.setUserName(user.getUsername());
		entity.setUserId(user.getId());
		entity.setUserPasswd(user.getPassword());
		return entity;
	}
}
