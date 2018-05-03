package com.example.medico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {

	@RequestMapping(value= {"/","/login"},method=RequestMethod.GET)
	public String get(Model model) {
		return "login";
	}
}
