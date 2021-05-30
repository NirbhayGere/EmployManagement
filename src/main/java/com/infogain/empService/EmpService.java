package com.infogain.empService;

import java.util.List;
import java.util.Optional;


import com.infogain.empModel.Employee;
import com.infogain.empRepo.EmpRepo;
import com.infogain.empRepo.EmpRepo.ViewDetails;


public interface EmpService {
	//======================predefined query=======================
	 Employee save(Employee e);
	 
	 List<Employee> saveAll(List<Employee> listEmp);
	 
	 List<Employee> findAll();
	 
	 Optional<Employee> getById(Integer empId);
	
	//======================custom query============================
	 List<String> getEmpNames(); 
	
	 List<Object[]> getEmpIdAndNames(); 

	 List<Employee> getAllEmployee(); 
	 
	 List<String> getEmpNamesById(Integer sid); 
	 
	 List<String> getEmpNamesByInput(Integer sid,Double sfee); 
	 
	 List<String> getDataA(String sname); 
	 
	 List<String> getDataB(List<Integer> data);
	 
	 List<String> getDataC(Integer a,Integer b); 
	 
	 List<String> getDataD(); 
	 //====================Native SQL=============================== 
	 //@Query(value = "select * from stdtab where sid>:a",nativeQuery = true) 
	 List<Employee> getDataE(Integer a); 
	 
	 //========================select particular columns using interface============

	 List<EmpRepo.ViewData> getSalNameDeptById(Integer id);
	 
	 List<ViewDetails> getByEmpDesgn(String empDesg);
}

