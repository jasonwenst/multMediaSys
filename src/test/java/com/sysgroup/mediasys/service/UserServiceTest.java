package com.sysgroup.mediasys.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sysgroup.mediasys.entity.UserEntity;
import com.sysgroup.mediasys.entity.UserEntity1;
import com.sysgroup.mediasys.model.User;
import com.sysgroup.mediasys.repository.UserRepository;
import com.sysgroup.mediasys.repository.UserRepository1;


public class UserServiceTest extends BaseJUnit4Test{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	
	@Test
	public void findUserByUsername() {
		
		UserEntity user = userRepository.findOne(1);
		
		System.out.print(user.toString());
	}
	
	
	@Test
	public void saveUser() {
		User entity = new User();
		entity.setUsername("TOM3");
		entity.setEmail("tom@qq.com");
		entity.setAddress("ÄÏ¾©");
		entity.setPassword("123456");
		entity.setSsoId("111111122");
		userService.saveUser(entity);
	}
	
	@Test
	public void getAll() {
		List<User> users = (List<User>) userService.findAllUsers();
		for(User entity : users) {
			System.out.println(entity.toString());
		}
	}

	@Test
	public void updateUser() {
		User user = new User();
		user.setAddress("zhejiang");
		user.setEmail("guolq@qq.com");
		user.setUsername("jason");
		user.setId(1);
		userService.updateUser(user);
		getAll();
		
	}

	@Test
	public void findByNameTest() {
		String name  = "jason";
		User user = userService.findByName(name);
		System.out.println(user.toString());
	}
	
	@Test
	public void login() {
		User user = new User();
		user.setUsername("yuanouwen");
		user.setPassword("78375943");
		System.out.println(userService.findByNameAndPassword(user));
	}
	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}


	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	
}
