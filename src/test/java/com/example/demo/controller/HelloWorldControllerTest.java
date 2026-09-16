package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldControllerTest {

	@Test
	void testHello() {
		String message = "My first CI pipeline implementation";
		assertEquals("My first CI pipeline implementation",message);
	}

}
