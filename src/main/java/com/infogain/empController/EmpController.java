package com.infogain.empController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infogain.empModel.Employee;
import com.infogain.empRepo.EmpRepo;
import com.infogain.empRepo.EmpRepo.ViewDetails;
import com.infogain.empService.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;

	
	public Employee saveEmployee(Employee emp) {
		Employee  empRes = empService.save(emp);
		//here u can perform action on the basis of result
		return empRes;
	}

	
	
	public List<Employee> saveAllEmployee(List<Employee> listEmp) {
		return empService.saveAll(listEmp); 
	}

	
	public List<Employee> findAllEmployee() {
		
		return empService.findAll();
	}

	
	public Optional<Employee> getEmpById(Integer empId) {
		
		return empService.getById(empId);
	}
	
	//===============custom query methods=======================
	
	//getting names
	public List<String> getEmpNames() {
		return empService.getEmpNames();
	}

	//getting all names and corresponding ids
	public List<Object[]> getEmpIdAndNames() {
		return empService.getEmpIdAndNames();
	}

	//getting all rows(employee details)
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}

	//getting name by id
	public List<String> getEmpNamesById(Integer empid) {
		return empService.getEmpNamesById(empid);
	}

	//getting names by multiple values
	public List<String> getEmpNamesByInput(Integer empid, Double empSal) {
		return empService.getEmpNamesByInput(empid,empSal);
	}

	
	public List<String> getDataA(String empname) {
		return empService.getDataA(empname);
	}

	
	public List<String> getDataB(List<Integer> data) {
		return empService.getDataB(data);
	}

	
	public List<String> getDataC(Integer a, Integer b) {
		return empService.getDataC(a,b);
	}

	
	public List<String> getDataD() {
		return empService.getDataD();
	}

	
	public List<Employee> getDataE(Integer a) {
		return empService.getDataE(a);
	}
	
	public List<EmpRepo.ViewData> getSalNameDeptById(Integer id){
		return empService.getSalNameDeptById(id);
	}
	
	
	public List<ViewDetails> getByEmpDesgn(String empDesg) {
		return empService.getByEmpDesgn(empDesg);
	}

}
