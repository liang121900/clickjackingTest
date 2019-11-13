package com.clickjacking.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/index")
//	report-uri http://localhost:8080/reports/csp/csp-report.json"
	public String getWelcome(HttpServletResponse response) {
//		response.addHeader("report-to", "{ \"group\": \"csp-endpoint\"," + 
//				"\"endpoints\": [" + 
//				" { \"url\": \"http://localhost:8080/reports/csp\" }" + 
//				"]} ");
		response.addHeader("Content-Security-Policy-Report-Only", "frame-ancestors 'none'; report-uri http://localhost:8080/reports/csp");
//		response.addHeader("X-Frame-Options", "DENY");
		return "hello";
		
	}
}
