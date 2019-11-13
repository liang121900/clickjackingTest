package com.clickjacking.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HackController {

	@GetMapping("/iframe")
	public String getWelcome(HttpServletResponse response) {
		return "iframe";
	}
	
}
