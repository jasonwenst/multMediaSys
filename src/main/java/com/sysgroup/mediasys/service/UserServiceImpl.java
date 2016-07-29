package com.sysgroup.mediasys.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.sysgroup.mediasys.converter.UserConverter;
import com.sysgroup.mediasys.entity.UserEntity;
import com.sysgroup.mediasys.model.User;
import com.sysgroup.mediasys.repository.UserRepository;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	private static List<User> users;
	
	@Autowired
	private UserRepository userRepository;
	

	public List<User> findAllUsers() {
		log.info("findAllUsers invocked!");
		users = new ArrayList<User>();
		List<UserEntity> entities = (List<UserEntity>) userRepository.findAll();
		for(UserEntity entity : entities) {
			users.add(UserConverter.convert(entity));
		}
		log.info("findAllUsers completed!");
		return users;
	}
	
	public User findById(int id) {
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
//		entity.setAddress(user.getAddress());
//		entity.setEmail(user.getEmail());
		entity.setUserName(user.getUsername());
		entity.setUserPasswd(user.getPassword());
		userRepository.save(entity);
	}

	public void deleteUserById(int id) {
		userRepository.delete(id);
	}

	public boolean isUserExist(User user) {
		return userRepository.exists(user.getId());
	}
	
	public void deleteAllUsers(){
		userRepository.deleteAll();
	}

	public boolean findByNameAndPassword(User user) {
		UserEntity userEntity = userRepository.findUserEntityByUserNameAndUserPasswd(user.getUsername(), user.getPassword());
		log.info("username = {}, password = {}",user.getUsername(), user.getPassword());
		return ObjectUtils.isEmpty(userEntity) ? false : true;
	}

}
