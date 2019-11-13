package com.clickjacking.demo.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reports")
public class CSPRestController {
	
	@PostMapping(value = "/csp",consumes = {"application/csp-report"},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getReport(@RequestBody String body) { 
		System.out.println("Received CSP violation report:" +body);
		ResponseEntity<String> res=new ResponseEntity<String>("success", HttpStatus.ACCEPTED);
		return res;
	}

	public CSPRestController() {
		super();
	}
	
	
	
}
