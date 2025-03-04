package com.jsL.test.jpa.mybatisCompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsL.test.jpa.mybatisCompany.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
