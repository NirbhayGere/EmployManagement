package com.infogain;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.infogain.empController.EmpController;
import com.infogain.empModel.Employee;
@Component
@Order(2)
public class CustomQueryDataTestRunner implements CommandLineRunner{

@Autowired
EmpController empController;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("===============custom query============");
		
		//get Employee names
		List<String> names = empController.getEmpNames(); 
		names.forEach(System.out::println);
		
		//get Employee names with ids
		List<Object[]> idsAndNames = empController.getEmpIdAndNames(); 
		idsAndNames .stream() .map(ob->ob[0]+"-"+ob[1]) .forEach(System.out::println);  
		
		//get all Employee
		List<Employee> list = empController.getAllEmployee(); 
		list.forEach(System.out::println);  
		
		//get details by Id
		empController.getEmpNamesById(11).forEach(System.out::println); 
		
		//get employee names by multiple input
		empController.getEmpNamesByInput(10,400.0).forEach(System.out::println); 
		
		
		//select name where it contains one char 
		empController.getDataA("_").forEach(System.out::println); 
		
		//select name where it contains A char 
	    //empController.getDataA("%A%").forEach(System.out::println); 
		
		
		empController.getDataB(Arrays.asList(10,12,14,18,22,96)).forEach(System.out::println); 
		
		
		empController.getDataC(10,15).forEach(System.out::println); 
		
		
		empController.getDataD().forEach(System.out::println); 
		
		
		
		
	}
	
}