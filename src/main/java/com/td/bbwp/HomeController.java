package com.td.bbwp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/aaa")
	public String index() {
		return "index";
	}

}