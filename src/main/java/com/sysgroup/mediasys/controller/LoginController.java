package com.sysgroup.mediasys.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sysgroup.mediasys.constant.LoginConstant;
import com.sysgroup.mediasys.model.User;
import com.sysgroup.mediasys.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Object login(@RequestBody User user, HttpServletResponse response) {
		if(userService.findByNameAndPassword(user)) {
			response.addCookie(new Cookie(LoginConstant.COOKIE_NAME,String.valueOf(System.currentTimeMillis())));
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
		
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	
}
