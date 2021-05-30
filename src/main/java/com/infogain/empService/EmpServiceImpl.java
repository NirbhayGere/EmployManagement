package com.infogain.empService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.empModel.Employee;
import com.infogain.empRepo.EmpRepo;
import com.infogain.empRepo.EmpRepo.ViewDetails;


@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpRepo empRepo;

	@Override
	public Employee save(Employee emp) {
		return empRepo.save(emp);
		
	}

	@Override
	public List<Employee> saveAll(List<Employee> listEmp) {
		return empRepo.saveAll(listEmp);
	}

	@Override
	public List<Employee> findAll() {
		
		return empRepo.findAll();
	}

	@Override
	public Optional<Employee> getById(Integer empId) {
		return empRepo.findById(empId);
	
	}
	
//================================custom query method=====================================	
	@Override
	public List<String> getEmpNames() {
		return empRepo.getEmpNames();
	}

	@Override
	public List<Object[]> getEmpIdAndNames() {
		return empRepo.getEmpIdAndNames();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.getAllEmployee();
	}

	@Override
	public List<String> getEmpNamesById(Integer empid) {
		return empRepo.getEmpNamesById(empid);
	}

	@Override
	public List<String> getEmpNamesByInput(Integer empid, Double empSal) {
		return empRepo.getEmpNamesByInput(empid,empSal);
	}

	@Override
	public List<String> getDataA(String empname) {
		return empRepo.getDataA(empname);
	}

	@Override
	public List<String> getDataB(List<Integer> data) {
		return empRepo.getDataB(data);
	}

	@Override
	public List<String> getDataC(Integer a, Integer b) {
		return empRepo.getDataC(a,b);
	}

	@Override
	public List<String> getDataD() {
		return empRepo.getDataD();
	}

	@Override
	public List<Employee> getDataE(Integer a) {
		//return empRepo.getDataE(a);
		return null;
	}

	@Override
	public List<EmpRepo.ViewData> getSalNameDeptById(Integer id) {
		return empRepo.getByEmpId(id);
		
	}

	@Override
	public List<ViewDetails> getByEmpDesgn(String empDesg) {
		return empRepo.getByEmpDesgn(empDesg);
	}
	
	
}
