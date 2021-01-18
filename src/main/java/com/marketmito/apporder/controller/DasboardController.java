package com.marketmito.apporder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboards/")
public class DasboardController {
	
	@GetMapping(value="list")
	public String dashboard() {
		return "dashboard/dashboard";
	}

}
