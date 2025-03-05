package com.jsL.test.jpa.mybatisRecruit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsL.test.jpa.mybatisRecruit.domain.Recruit;

public interface RecruitRepository extends JpaRepository<Recruit, Integer>{
	
	//1
	public List<Recruit>findById(int id);
	
	//2
	public List<Recruit>findByCompanyId(@Param("companyId")int companyId);
	
	//3번
	public List<Recruit>findByPositionAndType(String position, String type);
	
	//4번
	public List<Recruit>findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	

	//5번
	public List<Recruit>findTop3ByOrderBySalaryDesc();
	
	
	//6번
	public List<Recruit>findBySalaryBetweenAndRegion(int start, int end
														,String region);
	
	//7번
	@Query(value="SELECT * FROM `recruit` WHERE `type` = :type AND `salary` >= 8100 AND deadline >= '2026-04-10'"
			+ "	ORDER BY `salary` DESC", nativeQuery=true)
	public List<Recruit>nativeQuery(@Param("type")String type);
	
	
}
