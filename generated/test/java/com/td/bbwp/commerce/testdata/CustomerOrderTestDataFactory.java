package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class CustomerOrderTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.CustomerOrder> {

	private List<com.td.bbwp.commerce.CustomerOrder> customerOrders = new ArrayList<com.td.bbwp.commerce.CustomerOrder>();

	private static final Logger logger = Logger
			.getLogger(CustomerOrderTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	com.td.bbwp.commerce.testdata.CustomerTestDataFactory customerTestDataFactory = new com.td.bbwp.commerce.testdata.CustomerTestDataFactory();

	com.td.bbwp.commerce.testdata.PaymentMethodTestDataFactory paymentMethodTestDataFactory = new com.td.bbwp.commerce.testdata.PaymentMethodTestDataFactory();

	public void register(com.td.bbwp.commerce.CustomerOrder customerOrder) {
		customerOrders.add(customerOrder);
	}

	public com.td.bbwp.commerce.CustomerOrder createCustomerOrderOne() {
		com.td.bbwp.commerce.CustomerOrder customerOrder = new com.td.bbwp.commerce.CustomerOrder();

		try {

			customerOrder.setNotes("Lavendar");

			customerOrder.setShipDate(dateFormat
					.parse("2016.04.26 01:53:35 EDT"));

			customerOrder.setCustomer(customerTestDataFactory
					.createCustomerOne());

			customerOrder.setPaymentMethod(paymentMethodTestDataFactory
					.createPaymentMethodOne());

			register(customerOrder);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customerOrder;
	}

	public com.td.bbwp.commerce.CustomerOrder createCustomerOrderTwo() {
		com.td.bbwp.commerce.CustomerOrder customerOrder = new com.td.bbwp.commerce.CustomerOrder();

		try {

			customerOrder.setNotes("delta");

			customerOrder.setShipDate(dateFormat
					.parse("2016.03.21 12:50:15 EDT"));

			customerOrder.setCustomer(customerTestDataFactory
					.createCustomerTwo());

			customerOrder.setPaymentMethod(paymentMethodTestDataFactory
					.createPaymentMethodTwo());

			register(customerOrder);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customerOrder;
	}

	public com.td.bbwp.commerce.CustomerOrder createCustomerOrderThree() {
		com.td.bbwp.commerce.CustomerOrder customerOrder = new com.td.bbwp.commerce.CustomerOrder();

		try {

			customerOrder.setNotes("Mark");

			customerOrder.setShipDate(dateFormat
					.parse("2016.05.04 00:56:55 EDT"));

			customerOrder.setCustomer(customerTestDataFactory
					.createCustomerThree());

			customerOrder.setPaymentMethod(paymentMethodTestDataFactory
					.createPaymentMethodThree());

			register(customerOrder);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customerOrder;
	}

	public com.td.bbwp.commerce.CustomerOrder createCustomerOrderFour() {
		com.td.bbwp.commerce.CustomerOrder customerOrder = new com.td.bbwp.commerce.CustomerOrder();

		try {

			customerOrder.setNotes("gamma");

			customerOrder.setShipDate(dateFormat
					.parse("2016.05.01 18:35:49 EDT"));

			customerOrder.setCustomer(customerTestDataFactory
					.createCustomerFour());

			customerOrder.setPaymentMethod(paymentMethodTestDataFactory
					.createPaymentMethodFour());

			register(customerOrder);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customerOrder;
	}

	public com.td.bbwp.commerce.CustomerOrder createCustomerOrderFive() {
		com.td.bbwp.commerce.CustomerOrder customerOrder = new com.td.bbwp.commerce.CustomerOrder();

		try {

			customerOrder.setNotes("Mark");

			customerOrder.setShipDate(dateFormat
					.parse("2016.04.28 15:49:42 EDT"));

			customerOrder.setCustomer(customerTestDataFactory
					.createCustomerFive());

			customerOrder.setPaymentMethod(paymentMethodTestDataFactory
					.createPaymentMethodFive());

			register(customerOrder);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return customerOrder;
	}

	public void createAll() {
		createCustomerOrderOne();
		createCustomerOrderTwo();
		createCustomerOrderThree();
		createCustomerOrderFour();
		createCustomerOrderFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.CustomerOrder> getListOfRecords() {
		if (customerOrders.isEmpty())
			createAll();
		return customerOrders;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.CustomerOrder e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.CustomerOrder customerOrder : customerOrders) {
			persist(customerOrder);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new CustomerOrderTestDataFactory().persistAll(); 
	}

}
