package com.jsL.test.thymeleaf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafLoopController {
	
	
	@GetMapping("thymeleaf/test02")
	public String loop(Model model) {
		
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		
		
		
		model.addAttribute("musicRanking", musicRanking);
		
		
		return "thymeleaf/test02";
		
	}

}
