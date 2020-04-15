package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@GetMapping({"/","/home"})
	public String home(Model model, @RequestParam(value="message", required=false) String message) {
		model.addAttribute("message", message);
		return "AppHome";
	}
}
