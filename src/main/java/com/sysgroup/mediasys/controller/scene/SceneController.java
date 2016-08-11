package com.sysgroup.mediasys.controller.scene;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SceneController {

	@RequestMapping(value = "/app/scene", method = RequestMethod.GET)
	public String getSceneHomePage() {
		return "scene/app";
	}
}
