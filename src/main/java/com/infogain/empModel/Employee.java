package com.infogain.empModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@Column(name="edesg")
	private String empDesgn;
	@Column(name="edep")
	private String empDepart;
	@Column(name="eadd")
	private String empAdd;
	
	
	
	

}
