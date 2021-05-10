package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainContorller {
	@RequestMapping("/")
	public String main() {
		return "main";
	}
}
