package com.jsL.test.jpa.mybatisRecruit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.jpa.mybatisRecruit.domain.Recruit;
import com.jsL.test.jpa.mybatisRecruit.repository.RecruitRepository;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {
	
	@Autowired
	private RecruitRepository recrutiRepository;
	
	
	//1번
	@ResponseBody
	@GetMapping("/test01")
	public List<Recruit>test01(){
		
		List<Recruit>recruitList = recrutiRepository.findById(8);

		return recruitList;	
	}
	
	
	
	//2번
	@ResponseBody
	@GetMapping("/test02")
	public List<Recruit>test02(){
		
		List<Recruit>recruitList = recrutiRepository.findByCompanyId(1);

		return recruitList;	
	}
	
	
	//3번
	@ResponseBody
	@GetMapping("/test03")
	public List<Recruit>test03(){
		
		List<Recruit>recruitList = recrutiRepository.findByPositionAndType("웹 back-end 개발자", "정규직");

		return recruitList;	
	}
	
	
	//4번
		@ResponseBody
		@GetMapping("/test04")
		public List<Recruit>test04(){
			
			List<Recruit>recruitList = 
			recrutiRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);

			return recruitList;	
		}
	
	
		
	//5번
		@ResponseBody
		@GetMapping("/test05")
		public List<Recruit>test05(){
			
			List<Recruit>recruitList = 
			recrutiRepository.findTop3ByOrderBySalaryDesc();

			return recruitList;	
		}
		
		
		
	//6번
		@ResponseBody
		@GetMapping("/test06")
		public List<Recruit>test06(){
			
			List<Recruit>recruitList = 
			recrutiRepository.findBySalaryBetweenAndRegion(7000, 8500
															,"성남시 분당구");

			return recruitList;	
		}
		
		
	//7번
		@ResponseBody
		@GetMapping("/test07")
		public List<Recruit>test07(){
			
			List<Recruit>recruitList = 
			recrutiRepository.nativeQuery("정규직");

			return recruitList;	
		}
		
	
	
	
	
	
	
	
}
