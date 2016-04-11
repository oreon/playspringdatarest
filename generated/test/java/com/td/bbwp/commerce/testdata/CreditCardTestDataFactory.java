package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class CreditCardTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.CreditCard> {

	private List<com.td.bbwp.commerce.CreditCard> creditCards = new ArrayList<com.td.bbwp.commerce.CreditCard>();

	private static final Logger logger = Logger
			.getLogger(CreditCardTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.commerce.CreditCard creditCard) {
		creditCards.add(creditCard);
	}

	public com.td.bbwp.commerce.CreditCard createCreditCardOne() {
		com.td.bbwp.commerce.CreditCard creditCard = new com.td.bbwp.commerce.CreditCard();

		try {

			creditCard.setAccountAddress("beta");

			creditCard.setCcNumber("alpha");

			creditCard.setExpiry(dateFormat.parse("2016.03.26 14:42:29 EDT"));

			register(creditCard);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return creditCard;
	}

	public com.td.bbwp.commerce.CreditCard createCreditCardTwo() {
		com.td.bbwp.commerce.CreditCard creditCard = new com.td.bbwp.commerce.CreditCard();

		try {

			creditCard.setAccountAddress("gamma");

			creditCard.setCcNumber("Lavendar");

			creditCard.setExpiry(dateFormat.parse("2016.05.04 07:26:22 EDT"));

			register(creditCard);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return creditCard;
	}

	public com.td.bbwp.commerce.CreditCard createCreditCardThree() {
		com.td.bbwp.commerce.CreditCard creditCard = new com.td.bbwp.commerce.CreditCard();

		try {

			creditCard.setAccountAddress("Wilson");

			creditCard.setCcNumber("Wilson");

			creditCard.setExpiry(dateFormat.parse("2016.04.13 15:56:22 EDT"));

			register(creditCard);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return creditCard;
	}

	public com.td.bbwp.commerce.CreditCard createCreditCardFour() {
		com.td.bbwp.commerce.CreditCard creditCard = new com.td.bbwp.commerce.CreditCard();

		try {

			creditCard.setAccountAddress("theta");

			creditCard.setCcNumber("pi");

			creditCard.setExpiry(dateFormat.parse("2016.04.27 06:49:09 EDT"));

			register(creditCard);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return creditCard;
	}

	public com.td.bbwp.commerce.CreditCard createCreditCardFive() {
		com.td.bbwp.commerce.CreditCard creditCard = new com.td.bbwp.commerce.CreditCard();

		try {

			creditCard.setAccountAddress("Eric");

			creditCard.setCcNumber("epsilon");

			creditCard.setExpiry(dateFormat.parse("2016.04.04 07:51:57 EDT"));

			register(creditCard);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return creditCard;
	}

	public void createAll() {
		createCreditCardOne();
		createCreditCardTwo();
		createCreditCardThree();
		createCreditCardFour();
		createCreditCardFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.CreditCard> getListOfRecords() {
		if (creditCards.isEmpty())
			createAll();
		return creditCards;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.CreditCard e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.CreditCard creditCard : creditCards) {
			persist(creditCard);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new CreditCardTestDataFactory().persistAll(); 
	}

}
