package com.sudo.spring_mvc_starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage() {
		// returning a  view name
		return "main-page";
	}
	
	
}
