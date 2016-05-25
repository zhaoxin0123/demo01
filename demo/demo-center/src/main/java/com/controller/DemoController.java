package com.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	private static final Logger log = Logger.getLogger(DemoController.class);
	@Autowired
	private DemoService demoService;

	@ResponseBody  
	@RequestMapping("/test/{p}")
	public String showUserInfo(ModelMap modelMap, @PathVariable String p) {
		log.info("param:"+p+",service:"+demoService);
		return "hello world";
	}
}
