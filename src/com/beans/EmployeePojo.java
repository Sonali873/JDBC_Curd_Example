package com.beans;

public class EmployeePojo {

	private int id;
	private String empName;
	private String empDesignation;
	private String empAddress;

	public EmployeePojo( int id,String empName, String empDesignation, String empAddress) {

		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empAddress = empAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

//	@Override
//	public String toString() {
//		return "EmployeePojo [empName=" + empName + ", empDesignation=" + empDesignation + ", empAddress=" + empAddress
//				+ "]";
//	}

}
