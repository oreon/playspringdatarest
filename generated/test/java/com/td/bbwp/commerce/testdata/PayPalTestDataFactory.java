package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class PayPalTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.PayPal> {

	private List<com.td.bbwp.commerce.PayPal> payPals = new ArrayList<com.td.bbwp.commerce.PayPal>();

	private static final Logger logger = Logger
			.getLogger(PayPalTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.commerce.PayPal payPal) {
		payPals.add(payPal);
	}

	public com.td.bbwp.commerce.PayPal createPayPalOne() {
		com.td.bbwp.commerce.PayPal payPal = new com.td.bbwp.commerce.PayPal();

		try {

			payPal.setAccountAddress("beta");

			payPal.setPaypalAccountNumber("pi");

			register(payPal);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return payPal;
	}

	public com.td.bbwp.commerce.PayPal createPayPalTwo() {
		com.td.bbwp.commerce.PayPal payPal = new com.td.bbwp.commerce.PayPal();

		try {

			payPal.setAccountAddress("delta");

			payPal.setPaypalAccountNumber("John");

			register(payPal);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return payPal;
	}

	public com.td.bbwp.commerce.PayPal createPayPalThree() {
		com.td.bbwp.commerce.PayPal payPal = new com.td.bbwp.commerce.PayPal();

		try {

			payPal.setAccountAddress("Wilson");

			payPal.setPaypalAccountNumber("Lavendar");

			register(payPal);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return payPal;
	}

	public com.td.bbwp.commerce.PayPal createPayPalFour() {
		com.td.bbwp.commerce.PayPal payPal = new com.td.bbwp.commerce.PayPal();

		try {

			payPal.setAccountAddress("Mark");

			payPal.setPaypalAccountNumber("Wilson");

			register(payPal);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return payPal;
	}

	public com.td.bbwp.commerce.PayPal createPayPalFive() {
		com.td.bbwp.commerce.PayPal payPal = new com.td.bbwp.commerce.PayPal();

		try {

			payPal.setAccountAddress("pi");

			payPal.setPaypalAccountNumber("Malissa");

			register(payPal);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return payPal;
	}

	public void createAll() {
		createPayPalOne();
		createPayPalTwo();
		createPayPalThree();
		createPayPalFour();
		createPayPalFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.PayPal> getListOfRecords() {
		if (payPals.isEmpty())
			createAll();
		return payPals;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.PayPal e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.PayPal payPal : payPals) {
			persist(payPal);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new PayPalTestDataFactory().persistAll(); 
	}

}
