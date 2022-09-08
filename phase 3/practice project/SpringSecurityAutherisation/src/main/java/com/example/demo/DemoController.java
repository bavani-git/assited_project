package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DemoController {
@ResponseBody
	@RequestMapping("/")
	public String demo() {
		return "Gendral Information";
	}
@ResponseBody
@RequestMapping("/admin")
public String admin() {
	return "Admin page";
}

@ResponseBody
@RequestMapping("/user")
public String user() {
	return "User site page";
}



}
