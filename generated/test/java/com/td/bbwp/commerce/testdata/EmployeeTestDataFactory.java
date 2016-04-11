package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class EmployeeTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.Employee> {

	private List<com.td.bbwp.commerce.Employee> employees = new ArrayList<com.td.bbwp.commerce.Employee>();

	private static final Logger logger = Logger
			.getLogger(EmployeeTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	com.td.bbwp.commerce.testdata.DepartmentTestDataFactory departmentTestDataFactory = new com.td.bbwp.commerce.testdata.DepartmentTestDataFactory();

	public void register(com.td.bbwp.commerce.Employee employee) {
		employees.add(employee);
	}

	public com.td.bbwp.commerce.Employee createEmployeeOne() {
		com.td.bbwp.commerce.Employee employee = new com.td.bbwp.commerce.Employee();

		try {

			employee.setDob(dateFormat.parse("2016.03.19 14:36:55 EDT"));

			employee.getAddress().setStreet("Wilson");

			employee.getAddress().setCity("alpha");

			employee.getAddress().setProvince("delta");

			employee.setFirstName("epsilon");

			employee.setLastName("Eric");

			employee.setDepartment(departmentTestDataFactory
					.createDepartmentOne());

			register(employee);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return employee;
	}

	public com.td.bbwp.commerce.Employee createEmployeeTwo() {
		com.td.bbwp.commerce.Employee employee = new com.td.bbwp.commerce.Employee();

		try {

			employee.setDob(dateFormat.parse("2016.03.25 22:36:22 EDT"));

			employee.getAddress().setStreet("theta");

			employee.getAddress().setCity("alpha");

			employee.getAddress().setProvince("alpha");

			employee.setFirstName("delta");

			employee.setLastName("Lavendar");

			employee.setDepartment(departmentTestDataFactory
					.createDepartmentTwo());

			register(employee);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return employee;
	}

	public com.td.bbwp.commerce.Employee createEmployeeThree() {
		com.td.bbwp.commerce.Employee employee = new com.td.bbwp.commerce.Employee();

		try {

			employee.setDob(dateFormat.parse("2016.03.24 01:48:37 EDT"));

			employee.getAddress().setStreet("Eric");

			employee.getAddress().setCity("Lavendar");

			employee.getAddress().setProvince("alpha");

			employee.setFirstName("Malissa");

			employee.setLastName("gamma");

			employee.setDepartment(departmentTestDataFactory
					.createDepartmentThree());

			register(employee);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return employee;
	}

	public com.td.bbwp.commerce.Employee createEmployeeFour() {
		com.td.bbwp.commerce.Employee employee = new com.td.bbwp.commerce.Employee();

		try {

			employee.setDob(dateFormat.parse("2016.05.01 21:38:37 EDT"));

			employee.getAddress().setStreet("Lavendar");

			employee.getAddress().setCity("Eric");

			employee.getAddress().setProvince("theta");

			employee.setFirstName("Eric");

			employee.setLastName("Lavendar");

			employee.setDepartment(departmentTestDataFactory
					.createDepartmentFour());

			register(employee);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return employee;
	}

	public com.td.bbwp.commerce.Employee createEmployeeFive() {
		com.td.bbwp.commerce.Employee employee = new com.td.bbwp.commerce.Employee();

		try {

			employee.setDob(dateFormat.parse("2016.04.19 07:29:09 EDT"));

			employee.getAddress().setStreet("theta");

			employee.getAddress().setCity("delta");

			employee.getAddress().setProvince("Eric");

			employee.setFirstName("John");

			employee.setLastName("zeta");

			employee.setDepartment(departmentTestDataFactory
					.createDepartmentFive());

			register(employee);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return employee;
	}

	public void createAll() {
		createEmployeeOne();
		createEmployeeTwo();
		createEmployeeThree();
		createEmployeeFour();
		createEmployeeFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.Employee> getListOfRecords() {
		if (employees.isEmpty())
			createAll();
		return employees;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.Employee e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.Employee employee : employees) {
			persist(employee);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new EmployeeTestDataFactory().persistAll(); 
	}

}
