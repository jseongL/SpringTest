package com.jsL.test.mybatisSeller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsL.test.mybatisSeller.domain.Seller;
import com.jsL.test.mybatisSeller.service.SellerService;

@Controller
@RequestMapping("/mvc/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
//	@ResponseBody
	
	@PostMapping("/create")
	public String createSeller(
				@RequestParam("nickname") String nickname
				,@RequestParam("profileImage") String profileImage
				,@RequestParam("temperature") double temperature
			) {
		int count = sellerService.addSeller(nickname, profileImage, temperature);

		
		return "redirect:/mvc/seller/info";
		//create 메서드 실행 후 sellerInput() 실행
		
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		return "mvc/sellerInput";
	}
	
	
	//2번
	@GetMapping("/info")   		//파라메터가 비필수 항목이 되도록 설정          //널이여도 저장되도록
	public String sellerInfo(@RequestParam(value="id", required=false)Integer id,
			Model model) {
		
		Seller seller = null;
		if(id == null) {
			seller= sellerService.getLastSeller();	
		}
		else {
			seller = sellerService.getSeller(id);
		}
		
		model.addAttribute("seller", seller);//키 value형태로 저장
		
		return "mvc/sellerInfo";
	}
	
	
	
	//3번
	@GetMapping("/search")
	public String sellerSearch(Model model, @RequestParam("id")int id) {
		Seller seller= sellerService.getSearchSeller(id);
		//마지막 가져옴
		model.addAttribute("seller", seller);
		
		return "mvc/sellerInfo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
