package com.sysgroup.mediasys.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	public static Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "/app/login", method = RequestMethod.POST)
	public Object login(@RequestBody User user, HttpServletResponse response) {
		log.info("login processed!");
		if(userService.findByNameAndPassword(user)) {
			String loginTime  =  String.valueOf(System.currentTimeMillis());
			log.info("login successed! cookie.value = {}", loginTime);
			response.addCookie(new Cookie(LoginConstant.COOKIE_NAME, loginTime));
			return Boolean.TRUE;
		}else {
			log.info("login failed!");
			return Boolean.FALSE;
		}
		
	}
	
	@RequestMapping(value = "/app/login", method = RequestMethod.GET)
	public String login() {
		return "/login/login";
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/app/login/isLogined", method = RequestMethod.POST)
	public Object isLogin(HttpServletRequest request) {
		
		for(Cookie cookie : request.getCookies()) {
			if(LoginConstant.COOKIE_NAME.equals(cookie.getName())) {
				return Boolean.TRUE;
			}
		}
		
		return Boolean.FALSE;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	
}
