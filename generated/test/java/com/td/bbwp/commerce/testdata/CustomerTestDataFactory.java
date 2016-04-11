package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class CustomerTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.Customer> {

	private List<com.td.bbwp.commerce.Customer> customers = new ArrayList<com.td.bbwp.commerce.Customer>();

	private static final Logger logger = Logger
			.getLogger(CustomerTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.commerce.Customer customer) {
		customers.add(customer);
	}

	public com.td.bbwp.commerce.Customer createCustomerOne() {
		com.td.bbwp.commerce.Customer customer = new com.td.bbwp.commerce.Customer();

		try {

			customer.setDob(dateFormat.parse("2016.04.29 08:42:29 EDT"));

			customer.getAddress().setStreet("beta");

			customer.getAddress().setCity("delta");

			customer.getAddress().setProvince("beta");

			customer.setFirstName("John");

			customer.setLastName("gamma");

			register(customer);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customer;
	}

	public com.td.bbwp.commerce.Customer createCustomerTwo() {
		com.td.bbwp.commerce.Customer customer = new com.td.bbwp.commerce.Customer();

		try {

			customer.setDob(dateFormat.parse("2016.03.23 20:03:02 EDT"));

			customer.getAddress().setStreet("gamma");

			customer.getAddress().setCity("gamma");

			customer.getAddress().setProvince("Malissa");

			customer.setFirstName("epsilon");

			customer.setLastName("delta");

			register(customer);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customer;
	}

	public com.td.bbwp.commerce.Customer createCustomerThree() {
		com.td.bbwp.commerce.Customer customer = new com.td.bbwp.commerce.Customer();

		try {

			customer.setDob(dateFormat.parse("2016.05.01 11:49:09 EDT"));

			customer.getAddress().setStreet("Wilson");

			customer.getAddress().setCity("John");

			customer.getAddress().setProvince("beta");

			customer.setFirstName("Eric");

			customer.setLastName("Mark");

			register(customer);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customer;
	}

	public com.td.bbwp.commerce.Customer createCustomerFour() {
		com.td.bbwp.commerce.Customer customer = new com.td.bbwp.commerce.Customer();

		try {

			customer.setDob(dateFormat.parse("2016.03.23 00:49:42 EDT"));

			customer.getAddress().setStreet("Malissa");

			customer.getAddress().setCity("pi");

			customer.getAddress().setProvince("delta");

			customer.setFirstName("delta");

			customer.setLastName("Eric");

			register(customer);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customer;
	}

	public com.td.bbwp.commerce.Customer createCustomerFive() {
		com.td.bbwp.commerce.Customer customer = new com.td.bbwp.commerce.Customer();

		try {

			customer.setDob(dateFormat.parse("2016.04.09 17:41:57 EDT"));

			customer.getAddress().setStreet("epsilon");

			customer.getAddress().setCity("Wilson");

			customer.getAddress().setProvince("Lavendar");

			customer.setFirstName("delta");

			customer.setLastName("zeta");

			register(customer);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customer;
	}

	public void createAll() {
		createCustomerOne();
		createCustomerTwo();
		createCustomerThree();
		createCustomerFour();
		createCustomerFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.Customer> getListOfRecords() {
		if (customers.isEmpty())
			createAll();
		return customers;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.Customer e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.Customer customer : customers) {
			persist(customer);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new CustomerTestDataFactory().persistAll(); 
	}

}
