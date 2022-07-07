package com.jerri.singler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *  Single Responsibility Principle
 * @author Dinesh J
 * 
 * Cohesion - It is the degree to which the various parts of a software component are related
 *  -- we should aim for high Cohesion in a component
 *  Coupling - It is defined as the level of interdependency between various software components.
 *  -- we should aim for loose coupling
 *
 * Every software component should have only one RESPONSIBILITY/reason to change
 */

public class EmployeeBeforeSingle {

	private String employeeId;
	private String employeeName;
	private String empoyeeAddress;
	private String contactNumber;
	private String employeeType;
	
	public void save() {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
			statement = connection.createStatement();
			statement.execute("INSERT INTO EMPLOYEE VALUES ("+ this.employeeId + "," + this.employeeName +")");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void calculateTax() {
		if(this.getEmployeeType().equals("fulltime")) {
			//todo
		}
		if(this.getEmployeeType().equals("contract")) {
			//todo
		}
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String empoyeeName) {
		this.employeeName = empoyeeName;
	}
	public String getEmpoyeeAddress() {
		return empoyeeAddress;
	}
	public void setEmpoyeeAddress(String empoyeeAddress) {
		this.empoyeeAddress = empoyeeAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	
	
}
