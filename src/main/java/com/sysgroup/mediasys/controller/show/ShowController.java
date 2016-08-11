package com.sysgroup.mediasys.controller.show;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ShowController {

	@RequestMapping(value = "/app/show", method = RequestMethod.GET)
	public String getShowHomePage() {
		return "show/app";
	}
}
