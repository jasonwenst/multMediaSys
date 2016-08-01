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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import com.sysgroup.mediasys.constant.LoginConstant;

public class LoginFilter implements Filter {
	
	public static Logger log  = LoggerFactory.getLogger(LoginFilter.class);

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		HttpServletResponse rep = (HttpServletResponse) response;
		
		Cookie cookies[] = req.getCookies();
		Cookie cookie = isCookieExist(cookies);
		if(!ObjectUtils.isEmpty(req.getRequestURL())) {
			log.info(req.getRequestURL().toString());
		}
		if(req.getRequestURL().toString().endsWith("login") || req.getRequestURL().toString().endsWith("login.jsp")
				|| req.getRequestURL().toString().endsWith(".js") || req.getRequestURL().toString().endsWith(".html")
				 || req.getRequestURL().toString().endsWith(".css")  || req.getRequestURL().toString().endsWith(".jpg")) {
			chain.doFilter(req, rep);
		} else {
			if(!ObjectUtils.isEmpty(cookie)) {
				if((System.currentTimeMillis() - Long.valueOf(cookie.getValue())) > 10000*1000) {
					log.info("Redirect to {}" , req.getContextPath() +"/app/login");
					rep.sendRedirect(req.getContextPath() +"/app/login");
					return;
				} else {
					cookie.setValue(String.valueOf(System.currentTimeMillis()));
					chain.doFilter(req, rep);
				}
			} else {
				log.info("Redirect to {}" , req.getContextPath() +"/app/login");
				rep.sendRedirect(req.getContextPath() +"/app/login");
				return;
			}
		}
		
		
	}
	
	
	public void init(FilterConfig filterConfig) throws ServletException {

	}


	public void destroy() {

	}
	
	
	public Cookie isCookieExist(Cookie cookies[]) {
		if(cookies == null) {
			log.info("cookie is null!");
			return null;
		}
		for(Cookie cookie : cookies) {
			if(LoginConstant.COOKIE_NAME.equals(cookie.getName())) {
				log.info("find exist cookie,cookieName = {}, value = {}", cookie.getName(),cookie.getValue());
				return cookie;
			}
		}
		
		return null;
	}

}
