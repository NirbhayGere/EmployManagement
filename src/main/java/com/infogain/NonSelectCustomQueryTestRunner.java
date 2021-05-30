package com.infogain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.infogain.empController.EmpController;
import com.infogain.empRepo.EmpRepo;


@Component
@Order(3)
public class NonSelectCustomQueryTestRunner implements CommandLineRunner {
	@Autowired
	EmpController empController;
	
	@Override
	public void run(String... args) throws Exception {
		
	//getting fields by using Interface
	System.out.println("===============by Interface============");
	List<EmpRepo.ViewData> details = empController.getSalNameDeptById(12);
	for(EmpRepo.ViewData detail : details)
		System.out.println(detail.getEmpName()+"-"+detail.getEmpDepart()+"-"+detail.getEmpSal());
		
	
	
	List<EmpRepo.ViewDetails> EmpDetails = empController.getByEmpDesgn("software");
	for(EmpRepo.ViewDetails detail : EmpDetails)
		System.out.println(detail.getEmpName()+"-"+detail.getEmpAdd()+"-"+detail.getEmpDepart());
		
	}
	

}
