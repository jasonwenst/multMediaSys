package com.sysgroup.mediasys.controller.plan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class PlanController {
	

	@RequestMapping(value = "/app/plan", method = RequestMethod.GET)
	public String getPlanHomePage() {
		return "plan/app";
	}

}
