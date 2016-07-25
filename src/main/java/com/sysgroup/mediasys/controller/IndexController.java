package com.sysgroup.mediasys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	  @RequestMapping(method = RequestMethod.GET)
	    public String getIndexPage() {
	        return "index";
	    }

	  @RequestMapping(value = "index",method = RequestMethod.GET)
	    public String getIndex() {
	        return "index";
	    }
	  
}