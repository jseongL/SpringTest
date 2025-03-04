package com.jsL.test.jpa.mybatisCompany.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.jpa.mybatisCompany.domain.Company;
import com.jsL.test.jpa.mybatisCompany.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public Company addCompany(
			String name
			,String business
			,String scale
			,int headcount
			) {
		
		Company company = Company.builder()
		
		.name(name)
		.business(business)
		.scale(scale)
		.headcount(headcount)
		.build();
		
		Company result = companyRepository.save(company);
		
		return result;
		
	}
	
	
	public Company updateCompany(
			int id
			,String scale
			,int headcount
			) {
		
		Optional<Company>optionalCompany = companyRepository.findById(id);
		
		Company company = optionalCompany.orElse(null);
		
		company = company.toBuilder().scale(scale).build();
		company = company.toBuilder().headcount(headcount).build();
		
		Company result = companyRepository.save(company);
		
		return result;
		
		
	}
	
	
	public void deleteCompany(int id) {
		Optional<Company>optionalCompany = companyRepository.findById(id);
		
		Company company = optionalCompany.orElse(null);
		
		companyRepository.delete(company);
	}
	
	
	
	

}
