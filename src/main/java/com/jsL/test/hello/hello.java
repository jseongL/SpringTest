package com.jsL.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "jgvsvsd";
	}

}
