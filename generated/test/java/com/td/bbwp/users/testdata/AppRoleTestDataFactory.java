package com.td.bbwp.users.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class AppRoleTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.users.AppRole> {

	private List<com.td.bbwp.users.AppRole> appRoles = new ArrayList<com.td.bbwp.users.AppRole>();

	private static final Logger logger = Logger
			.getLogger(AppRoleTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.users.AppRole appRole) {
		appRoles.add(appRole);
	}

	public com.td.bbwp.users.AppRole createAppRoleOne() {
		com.td.bbwp.users.AppRole appRole = new com.td.bbwp.users.AppRole();

		try {

			appRole.setName("pi");

			register(appRole);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appRole;
	}

	public com.td.bbwp.users.AppRole createAppRoleTwo() {
		com.td.bbwp.users.AppRole appRole = new com.td.bbwp.users.AppRole();

		try {

			appRole.setName("alpha");

			register(appRole);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appRole;
	}

	public com.td.bbwp.users.AppRole createAppRoleThree() {
		com.td.bbwp.users.AppRole appRole = new com.td.bbwp.users.AppRole();

		try {

			appRole.setName("gamma");

			register(appRole);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appRole;
	}

	public com.td.bbwp.users.AppRole createAppRoleFour() {
		com.td.bbwp.users.AppRole appRole = new com.td.bbwp.users.AppRole();

		try {

			appRole.setName("John");

			register(appRole);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appRole;
	}

	public com.td.bbwp.users.AppRole createAppRoleFive() {
		com.td.bbwp.users.AppRole appRole = new com.td.bbwp.users.AppRole();

		try {

			appRole.setName("gamma");

			register(appRole);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appRole;
	}

	public void createAll() {
		createAppRoleOne();
		createAppRoleTwo();
		createAppRoleThree();
		createAppRoleFour();
		createAppRoleFive();

	}

	//@Override
	public List<com.td.bbwp.users.AppRole> getListOfRecords() {
		if (appRoles.isEmpty())
			createAll();
		return appRoles;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.users.AppRole e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.users.AppRole appRole : appRoles) {
			persist(appRole);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new AppRoleTestDataFactory().persistAll(); 
	}

}
