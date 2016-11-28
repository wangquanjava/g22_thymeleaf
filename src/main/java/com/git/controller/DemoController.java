package com.git.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.git.domain.AjaxJson;
import com.git.service.DemoService;

@Controller
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/home/xx")
	public String get(Model model){
		model.addAttribute("username", "王权");
		return "home";
	}
	
}
