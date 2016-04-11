package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class DepartmentTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.Department> {

	private List<com.td.bbwp.commerce.Department> departments = new ArrayList<com.td.bbwp.commerce.Department>();

	private static final Logger logger = Logger
			.getLogger(DepartmentTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	// @In(create = true,  value="employeeList")
	//com.td.bbwp.web.action.commerce.EmployeeListQuery employeeList;

	public void register(com.td.bbwp.commerce.Department department) {
		departments.add(department);
	}

	public com.td.bbwp.commerce.Department createDepartmentOne() {
		com.td.bbwp.commerce.Department department = new com.td.bbwp.commerce.Department();

		try {

			department.setName("Malissa");

			register(department);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return department;
	}

	public com.td.bbwp.commerce.Department createDepartmentTwo() {
		com.td.bbwp.commerce.Department department = new com.td.bbwp.commerce.Department();

		try {

			department.setName("pi");

			register(department);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return department;
	}

	public com.td.bbwp.commerce.Department createDepartmentThree() {
		com.td.bbwp.commerce.Department department = new com.td.bbwp.commerce.Department();

		try {

			department.setName("Wilson");

			register(department);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return department;
	}

	public com.td.bbwp.commerce.Department createDepartmentFour() {
		com.td.bbwp.commerce.Department department = new com.td.bbwp.commerce.Department();

		try {

			department.setName("delta");

			register(department);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return department;
	}

	public com.td.bbwp.commerce.Department createDepartmentFive() {
		com.td.bbwp.commerce.Department department = new com.td.bbwp.commerce.Department();

		try {

			department.setName("delta");

			register(department);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return department;
	}

	public void createAll() {
		createDepartmentOne();
		createDepartmentTwo();
		createDepartmentThree();
		createDepartmentFour();
		createDepartmentFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.Department> getListOfRecords() {
		if (departments.isEmpty())
			createAll();
		return departments;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.Department e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.Department department : departments) {
			persist(department);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new DepartmentTestDataFactory().persistAll(); 
	}

}
