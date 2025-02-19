package com.jsL.test.mybatisRealtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.mybatisRealtor.domain.Realtor;
import com.jsL.test.mybatisRealtor.service.RealtorService;

@Controller
@RequestMapping("/mvc/realtor")
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;
	
	@ResponseBody
	@GetMapping("/create")
	public String createRealtor(
			@RequestParam("office")String office
			,@RequestParam("phoneNumber")String phoneNumber
			,@RequestParam("address")String address
			,@RequestParam("grade")String grade
			,Model model
			) {
		
		//int count = realtorService.insertRealtor();
	
		Realtor realtor = new Realtor();
		realtor.setOffice(office);
		realtor.setPhoneNumber(phoneNumber);
		realtor.setAddress(address);
		realtor.setGrade(grade);
		
		
	
		int count = realtorService.addRealtorByObject(realtor);
		
		model.addAttribute("realtor", realtor);
		
		return "삽입결과 : " + count;
		
		
		//return "realtorInfo";
		
		
	}
	
	@GetMapping("/input")
	public String realtorInput() {
		return "mvc/realtorInput";
	}
	
	
	

}
