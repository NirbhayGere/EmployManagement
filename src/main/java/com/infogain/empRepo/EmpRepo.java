package com.infogain.empRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.infogain.empModel.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
	
	//=========================custom query============================
	//Here query should must take the value of modal fields not table fields
	
	 @Query("SELECT emp.empName FROM Employee emp") 
	 List<String> getEmpNames(); 
	 
	 @Query("SELECT empId,empName FROM Employee") 
	 List<Object[]> getEmpIdAndNames(); 
	 
	 @Query("SELECT emp FROM Employee emp ") 
	 List<Employee> getAllEmployee(); 
	 
	 @Query("SELECT emp.empName FROM Employee emp WHERE emp.empId>?1") 
	 List<String> getEmpNamesById(Integer empid); 
	 
	 @Query("SELECT emp.empName FROM Employee emp WHERE emp.empId>?1 or emp.empSal<=?2") 
	 List<String> getEmpNamesByInput(Integer empid,Double empSal); 
	 
	 @Query("SELECT empName FROM Employee where empName like :ename") 
	 List<String> getDataA(String ename); 
	 
	 @Query("SELECT empName FROM Employee where empId in (:data)") 
	 List<String> getDataB(List<Integer> data); 
	 
	 @Query("SELECT empName FROM Employee where empId between :a and :b") 
	 List<String> getDataC(Integer a,Integer b); 
	 
	 //@Query("SELECT empName FROM Employee where empName IS NULL") 
	 @Query("SELECT empName FROM Employee where empName IS NOT NULL") 
	 List<String> getDataD(); 
	 
	
	 // @Query("select empName,empSal,empDepart from Employee where empId=?")
	 //here name should be use in proper way like ...ByColumnName	 
	 List<ViewData> getByEmpId(Integer empId);
	 
	 interface ViewData {
		 	//All fields match with model fields
			Double getEmpSal();
			String getEmpName();
			String getEmpDepart();
	 }
	

	 List<ViewDetails> getByEmpDesgn(String Desgn);
	 
	 interface ViewDetails {
		 	//All fields match with model fields
			String getEmpDepart();
			String getEmpName();
			String getEmpAdd();
	 }

}
