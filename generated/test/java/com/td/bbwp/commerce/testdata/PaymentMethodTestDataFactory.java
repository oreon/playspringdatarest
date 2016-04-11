package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class PaymentMethodTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.PaymentMethod> {

	private List<com.td.bbwp.commerce.PaymentMethod> paymentMethods = new ArrayList<com.td.bbwp.commerce.PaymentMethod>();

	private static final Logger logger = Logger
			.getLogger(PaymentMethodTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.commerce.PaymentMethod paymentMethod) {
		paymentMethods.add(paymentMethod);
	}

	public com.td.bbwp.commerce.PaymentMethod createPaymentMethodOne() {
		com.td.bbwp.commerce.PaymentMethod paymentMethod = new com.td.bbwp.commerce.PaymentMethod();

		try {

			paymentMethod.setAccountAddress("zeta");

			register(paymentMethod);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return paymentMethod;
	}

	public com.td.bbwp.commerce.PaymentMethod createPaymentMethodTwo() {
		com.td.bbwp.commerce.PaymentMethod paymentMethod = new com.td.bbwp.commerce.PaymentMethod();

		try {

			paymentMethod.setAccountAddress("Lavendar");

			register(paymentMethod);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return paymentMethod;
	}

	public com.td.bbwp.commerce.PaymentMethod createPaymentMethodThree() {
		com.td.bbwp.commerce.PaymentMethod paymentMethod = new com.td.bbwp.commerce.PaymentMethod();

		try {

			paymentMethod.setAccountAddress("Wilson");

			register(paymentMethod);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return paymentMethod;
	}

	public com.td.bbwp.commerce.PaymentMethod createPaymentMethodFour() {
		com.td.bbwp.commerce.PaymentMethod paymentMethod = new com.td.bbwp.commerce.PaymentMethod();

		try {

			paymentMethod.setAccountAddress("zeta");

			register(paymentMethod);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return paymentMethod;
	}

	public com.td.bbwp.commerce.PaymentMethod createPaymentMethodFive() {
		com.td.bbwp.commerce.PaymentMethod paymentMethod = new com.td.bbwp.commerce.PaymentMethod();

		try {

			paymentMethod.setAccountAddress("Lavendar");

			register(paymentMethod);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return paymentMethod;
	}

	public void createAll() {
		createPaymentMethodOne();
		createPaymentMethodTwo();
		createPaymentMethodThree();
		createPaymentMethodFour();
		createPaymentMethodFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.PaymentMethod> getListOfRecords() {
		if (paymentMethods.isEmpty())
			createAll();
		return paymentMethods;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.PaymentMethod e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.PaymentMethod paymentMethod : paymentMethods) {
			persist(paymentMethod);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new PaymentMethodTestDataFactory().persistAll(); 
	}

}
