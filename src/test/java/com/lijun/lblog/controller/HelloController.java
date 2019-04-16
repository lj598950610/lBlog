package com.lijun.lblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit lijun.com!";
	}
	
	@GetMapping("/index")
	public ModelAndView toIndex() {
		return new ModelAndView("/index");
	}
	
}