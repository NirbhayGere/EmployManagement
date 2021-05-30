package com.infogain;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.infogain.empController.EmpController;
import com.infogain.empModel.Employee;

@Component
@Order(1)
public class DataTestRunner implements CommandLineRunner{

	@Autowired
	EmpController empController;
	
	@Override
	public void run(String... args) throws Exception {
		
		//below are all predefined query methods
		
		System.out.println("=============storing data by save=============");
		Employee emp = empController.saveEmployee(new Employee(11, "subham", 450000.00, "software", "IT", "Gaya"));
		System.out.println(emp.getEmpId()+","+emp.getEmpName()+","+emp.getEmpDepart()+","+emp.getEmpSal()+","+emp.getEmpDesgn());
	
		
		
		System.out.println("===============storing data by saveAll==========");
		List<Employee> empList = empController.saveAllEmployee(Arrays.asList(new Employee(12, "nirbhay", 50000.00, "software", "IT", "Bihar"),
													new Employee(13, "ram", 60000.00, "software", "IT1", "Delhi"),
													new Employee(14, "tom",60000.00, "software", "IT4", "Spain")));
		//JDk 1.8 Method ref. for displaying list
		empList.forEach(System.out::println);
	
		
		
		System.out.println("===================retrieving data by Id===========");
		Optional<Employee> optEmp = empController.getEmpById(12);
		if(optEmp.isPresent()) {
			Employee empById = optEmp.get();
			System.out.println(empById.getEmpId()+","+empById.getEmpName()+","+empById.getEmpDepart()+","+empById.getEmpSal()+","+empById.getEmpDesgn());
		}
		else {
			System.out.println("id does not exixt in database");
		}
		
		
		System.out.println("===============retrieving All data by Id============");
		empController.findAllEmployee().forEach(System.out::println);
		
		
		
		
	}
	

}
