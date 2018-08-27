package com.manman.spring5tutorial.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manman.spring5tutorial.utils.MyUtils;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		
		model.addAttribute("name",MyUtils.getMessage("text", "http://below18.example.com", "http://above18.example.com"));
		
		return "hello";
	}
	
	@RequestMapping("/hello/{id}")
	public String helloId(Model model, @PathVariable int id, @RequestParam Optional<String> name) {
		
		model.addAttribute("id", id);
		model.addAttribute("name",name.orElse("No Name"));
		
		return "hello-id";
	}
	
//	@RequestMapping("/hello")
//	public ModelAndView hello() {
//		ModelAndView mav = new ModelAndView("hello");
//		mav.addObject("name","ManMan");
//		return mav;
//	}
	
}
