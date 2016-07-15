package com.sysgroup.mediasys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysgroup.mediasys.converter.UserConverter;
import com.sysgroup.mediasys.entity.UserEntity;
import com.sysgroup.mediasys.model.User;
import com.sysgroup.mediasys.repository.UserRepository;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	
	private static List<User> users;
	
	@Autowired
	private UserRepository userRepository;
	

	public List<User> findAllUsers() {
		users = new ArrayList<User>();
		List<UserEntity> entities = (List<UserEntity>) userRepository.findAll();
		for(UserEntity entity : entities) {
			users.add(UserConverter.convert(entity));
		}
		return users;
	}
	
	public User findById(long id) {
		UserEntity entity = userRepository.findOne(id);
		if(entity != null) {
			return UserConverter.convert(entity);
		}
		return null;
	}
	
	public User findByName(String name) {
		return UserConverter.convert(userRepository.findUserEntityByUserName(name));
	}
	
	public void saveUser(User user) {
		
		userRepository.save(UserConverter.convertToEntity(user));
	}

	public void updateUser(User user) {
		UserEntity entity = userRepository.findOne(user.getId());
		entity.setAddress(user.getAddress());
		entity.setEmail(user.getEmail());
		entity.setUserName(user.getUsername());
		userRepository.save(entity);
	}

	public void deleteUserById(long id) {
		userRepository.delete(id);
	}

	public boolean isUserExist(User user) {
		return userRepository.exists(user.getId());
	}
	
	public void deleteAllUsers(){
		userRepository.deleteAll();
	}

}
