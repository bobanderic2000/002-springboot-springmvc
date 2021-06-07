package com.pn.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IndexController {

	@RequestMapping
	@ResponseBody
	public String say() {
		return "Hello, fffaffrfrfryyhff SpringBoot!";
	}
	
}
