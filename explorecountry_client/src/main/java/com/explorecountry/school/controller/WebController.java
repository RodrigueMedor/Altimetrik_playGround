package com.explorecountry.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	
	@RequestMapping(value="/")
	public String input() {
		
		return "index";
	}

}