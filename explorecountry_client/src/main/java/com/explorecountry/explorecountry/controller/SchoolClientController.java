package com.explorecountry.explorecountry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SchoolClientController {
	
	
	@RequestMapping(value="/")
	public String input() {
		
		return "test";
	}

}
