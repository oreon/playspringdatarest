package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class ProductTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.Product> {

	private List<com.td.bbwp.commerce.Product> products = new ArrayList<com.td.bbwp.commerce.Product>();

	private static final Logger logger = Logger
			.getLogger(ProductTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	public void register(com.td.bbwp.commerce.Product product) {
		products.add(product);
	}

	public com.td.bbwp.commerce.Product createProductOne() {
		com.td.bbwp.commerce.Product product = new com.td.bbwp.commerce.Product();

		try {

			product.setName("Lavendar");

			register(product);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return product;
	}

	public com.td.bbwp.commerce.Product createProductTwo() {
		com.td.bbwp.commerce.Product product = new com.td.bbwp.commerce.Product();

		try {

			product.setName("delta");

			register(product);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return product;
	}

	public com.td.bbwp.commerce.Product createProductThree() {
		com.td.bbwp.commerce.Product product = new com.td.bbwp.commerce.Product();

		try {

			product.setName("Lavendar");

			register(product);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return product;
	}

	public com.td.bbwp.commerce.Product createProductFour() {
		com.td.bbwp.commerce.Product product = new com.td.bbwp.commerce.Product();

		try {

			product.setName("gamma");

			register(product);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return product;
	}

	public com.td.bbwp.commerce.Product createProductFive() {
		com.td.bbwp.commerce.Product product = new com.td.bbwp.commerce.Product();

		try {

			product.setName("Malissa");

			register(product);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return product;
	}

	public void createAll() {
		createProductOne();
		createProductTwo();
		createProductThree();
		createProductFour();
		createProductFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.Product> getListOfRecords() {
		if (products.isEmpty())
			createAll();
		return products;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.Product e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.Product product : products) {
			persist(product);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new ProductTestDataFactory().persistAll(); 
	}

}
