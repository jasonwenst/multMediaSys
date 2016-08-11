package com.sysgroup.mediasys.controller.material;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sysgroup.mediasys.entity.MaterialEntity;
import com.sysgroup.mediasys.service.MaterialService;

@Controller
@RequestMapping("/")
public class MaterialController {
	
	public static Logger log = LoggerFactory.getLogger(MaterialController.class);
	
	@Autowired
	private MaterialService materialService;

	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<MaterialEntity> getEntities(@RequestParam("currentPage") int currentPage, 
			@RequestParam("pageSize") int pageSize) {
		
		Sort sort = new Sort(Direction.DESC, "uploadDate");
		Pageable page = new PageRequest(currentPage, pageSize, sort);
		
		return (ResponseEntity<MaterialEntity>) materialService.getEntitiesByPage(page);
		
	}
	
	@RequestMapping(value="/app/default", method = RequestMethod.GET)
	public String getDefaultPage() {
		return "default/app";
	}
	
	@RequestMapping(value="/app/material", method = RequestMethod.GET)
	public String getMagerialPage() {
		return "material/app";
	}
	
	
}
