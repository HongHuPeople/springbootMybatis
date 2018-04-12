package com.zhouwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String toIndex(Model model) {
		System.out.println("Welcome to Index!");
		return "index";
	}
	
}
