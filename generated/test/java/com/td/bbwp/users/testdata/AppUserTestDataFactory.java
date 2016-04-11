package com.td.bbwp.users.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class AppUserTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.users.AppUser> {

	private List<com.td.bbwp.users.AppUser> appUsers = new ArrayList<com.td.bbwp.users.AppUser>();

	private static final Logger logger = Logger
			.getLogger(AppUserTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.users.AppUser appUser) {
		appUsers.add(appUser);
	}

	public com.td.bbwp.users.AppUser createAppUserOne() {
		com.td.bbwp.users.AppUser appUser = new com.td.bbwp.users.AppUser();

		try {

			appUser.setUserName("theta");

			appUser.setPassword("Lavendar");

			appUser.setEnabled(true);

			register(appUser);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appUser;
	}

	public com.td.bbwp.users.AppUser createAppUserTwo() {
		com.td.bbwp.users.AppUser appUser = new com.td.bbwp.users.AppUser();

		try {

			appUser.setUserName("Lavendar");

			appUser.setPassword("Mark");

			appUser.setEnabled(true);

			register(appUser);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appUser;
	}

	public com.td.bbwp.users.AppUser createAppUserThree() {
		com.td.bbwp.users.AppUser appUser = new com.td.bbwp.users.AppUser();

		try {

			appUser.setUserName("Lavendar");

			appUser.setPassword("Eric");

			appUser.setEnabled(true);

			register(appUser);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appUser;
	}

	public com.td.bbwp.users.AppUser createAppUserFour() {
		com.td.bbwp.users.AppUser appUser = new com.td.bbwp.users.AppUser();

		try {

			appUser.setUserName("epsilon");

			appUser.setPassword("theta");

			appUser.setEnabled(true);

			register(appUser);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appUser;
	}

	public com.td.bbwp.users.AppUser createAppUserFive() {
		com.td.bbwp.users.AppUser appUser = new com.td.bbwp.users.AppUser();

		try {

			appUser.setUserName("Mark");

			appUser.setPassword("theta");

			appUser.setEnabled(true);

			register(appUser);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return appUser;
	}

	public void createAll() {
		createAppUserOne();
		createAppUserTwo();
		createAppUserThree();
		createAppUserFour();
		createAppUserFive();

	}

	//@Override
	public List<com.td.bbwp.users.AppUser> getListOfRecords() {
		if (appUsers.isEmpty())
			createAll();
		return appUsers;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.users.AppUser e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.users.AppUser appUser : appUsers) {
			persist(appUser);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new AppUserTestDataFactory().persistAll(); 
	}

}
