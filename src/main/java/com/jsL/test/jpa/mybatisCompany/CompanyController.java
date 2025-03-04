package com.jsL.test.jpa.mybatisCompany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.jpa.mybatisCompany.domain.Company;
import com.jsL.test.jpa.mybatisCompany.service.CompanyService;

@Controller
@RequestMapping("/jpa/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@ResponseBody
	@GetMapping("/create")
	public List<Company> createCompany() {
		
		
		Company company1 = companyService.addCompany("넥손","컨텐츠게임","대기업",3585);
		Company company2 = companyService.addCompany("버블팝","여신금융업","대기업",6834);
		
		List<Company>companyList = new ArrayList<>();
		companyList.add(company1);
		companyList.add(company2);
		
		return companyList;
	}
	
	
	@ResponseBody
	@GetMapping("/update")
	public Company updateCompany() {
		
		Company company = companyService.updateCompany(13,"중소기업",34);
		
		
		return company;
		
		
	}
	
	
	@ResponseBody
	@GetMapping("/delete")
	public String deleteCompany() {
		companyService.deleteCompany(11);
		return "수항 완료";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
