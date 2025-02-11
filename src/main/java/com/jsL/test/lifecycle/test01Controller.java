package com.jsL.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test01Controller {
	
	@RequestMapping("/lifecycle/test01")
	public String thymeleafResponse() {
		return "lifecycle/test01";
	}

}
