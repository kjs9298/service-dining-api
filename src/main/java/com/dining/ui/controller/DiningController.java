package com.dining.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiningController {

	@RequestMapping(value = "/home")
	public String index() {
		return "index.html";
	}

}
