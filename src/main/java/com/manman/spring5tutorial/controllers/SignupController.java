package com.manman.spring5tutorial.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manman.spring5tutorial.commands.UserCommand;

@Controller
@RequestMapping("/signup")
public class SignupController {
	
	private static Log log = LogFactory.getLog(SignupController.class);
	
	@GetMapping
	public String signup(Model model) {
		
		model.addAttribute("user", new UserCommand());
		return "signup";
	}
	
	@PostMapping
	public String doSignup(@Validated @ModelAttribute("user") UserCommand user, BindingResult result) {
		
		if (result.hasErrors()) {
			return "signup";
		}
		
		log.info("Email: "+user.getEmail() + "; Name: " + user.getName() + "; Password: "+user.getPassword());
		
		return "redirect:/";
	}
	
}
