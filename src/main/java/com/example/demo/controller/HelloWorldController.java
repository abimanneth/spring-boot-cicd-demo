package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class HelloWorldController {

	@GetMapping(path="/hello")
	public String hello() {
		return "My first CI pipeline implementation";
	}
}
