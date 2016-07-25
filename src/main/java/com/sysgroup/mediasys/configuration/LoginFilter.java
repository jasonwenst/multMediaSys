package com.sysgroup.mediasys.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.ObjectUtils;

import com.sysgroup.mediasys.constant.LoginConstant;

public class LoginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;
		
		Cookie cookies[] = req.getCookies();
		Cookie cookie = isCookieExist(cookies);
		if(req.getRequestURL().toString().endsWith("login") || req.getRequestURL().toString().endsWith("login.jsp")
				|| req.getRequestURL().toString().endsWith(".js") || req.getRequestURL().toString().endsWith(".html")) {
			chain.doFilter(req, rep);
		} else {
			if(!ObjectUtils.isEmpty(cookie)) {
				if((System.currentTimeMillis() - Long.valueOf(cookie.getValue())) > 100*1000) {
					rep.sendRedirect(req.getContextPath() +"/login");
					return;
				} else {
					cookie.setValue(String.valueOf(System.currentTimeMillis()));
				}
			} else {
				rep.sendRedirect(req.getContextPath() +"/login");
				return;
			}
		}
		
		
	}
	
	
	public void init(FilterConfig filterConfig) throws ServletException {

	}


	public void destroy() {

	}
	
	
	public Cookie isCookieExist(Cookie cookies[]) {
		if(cookies == null) 
			return null;
		for(Cookie cookie : cookies) {
			if(LoginConstant.COOKIE_NAME.equals(cookie.getName())) {
				return cookie;
			}
		}
		
		return null;
	}

}
