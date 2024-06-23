package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @GetMapping("/hello")
	public String getMethodName(@RequestParam(value ="name", defaultValue = "world") String name) {
		return String.format("Hello %s!", name);
	}
}
