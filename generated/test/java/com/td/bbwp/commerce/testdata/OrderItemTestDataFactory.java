package com.td.bbwp.commerce.testdata;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

//import org.witchcraft.model.support.errorhandling.BusinessException;
//import org.witchcraft.model.randomgen.RandomValueGeneratorFactory;

import org.apache.log4j.Logger;

public class OrderItemTestDataFactory
		extends
			AbstractTestDataFactory<com.td.bbwp.commerce.OrderItem> {

	private List<com.td.bbwp.commerce.OrderItem> orderItems = new ArrayList<com.td.bbwp.commerce.OrderItem>();

	private static final Logger logger = Logger
			.getLogger(OrderItemTestDataFactory.class);

	private static int RECORDS_TO_CREATE = 3;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy.MM.dd HH:mm:ss z");

	com.td.bbwp.commerce.testdata.ProductTestDataFactory productTestDataFactory = new com.td.bbwp.commerce.testdata.ProductTestDataFactory();

	com.td.bbwp.commerce.testdata.CustomerOrderTestDataFactory customerOrderTestDataFactory = new com.td.bbwp.commerce.testdata.CustomerOrderTestDataFactory();

	public void register(com.td.bbwp.commerce.OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public com.td.bbwp.commerce.OrderItem createOrderItemOne() {
		com.td.bbwp.commerce.OrderItem orderItem = new com.td.bbwp.commerce.OrderItem();

		try {

			orderItem.setQty(4155);

			orderItem.setProduct(productTestDataFactory.createProductOne());

			orderItem.setCustomerOrder(customerOrderTestDataFactory
					.createCustomerOrderOne());

			register(orderItem);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return orderItem;
	}

	public com.td.bbwp.commerce.OrderItem createOrderItemTwo() {
		com.td.bbwp.commerce.OrderItem orderItem = new com.td.bbwp.commerce.OrderItem();

		try {

			orderItem.setQty(4156);

			orderItem.setProduct(productTestDataFactory.createProductTwo());

			orderItem.setCustomerOrder(customerOrderTestDataFactory
					.createCustomerOrderTwo());

			register(orderItem);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return orderItem;
	}

	public com.td.bbwp.commerce.OrderItem createOrderItemThree() {
		com.td.bbwp.commerce.OrderItem orderItem = new com.td.bbwp.commerce.OrderItem();

		try {

			orderItem.setQty(8250);

			orderItem.setProduct(productTestDataFactory.createProductThree());

			orderItem.setCustomerOrder(customerOrderTestDataFactory
					.createCustomerOrderThree());

			register(orderItem);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return orderItem;
	}

	public com.td.bbwp.commerce.OrderItem createOrderItemFour() {
		com.td.bbwp.commerce.OrderItem orderItem = new com.td.bbwp.commerce.OrderItem();

		try {

			orderItem.setQty(77);

			orderItem.setProduct(productTestDataFactory.createProductFour());

			orderItem.setCustomerOrder(customerOrderTestDataFactory
					.createCustomerOrderFour());

			register(orderItem);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return orderItem;
	}

	public com.td.bbwp.commerce.OrderItem createOrderItemFive() {
		com.td.bbwp.commerce.OrderItem orderItem = new com.td.bbwp.commerce.OrderItem();

		try {

			orderItem.setQty(5126);

			orderItem.setProduct(productTestDataFactory.createProductFive());

			orderItem.setCustomerOrder(customerOrderTestDataFactory
					.createCustomerOrderFive());

			register(orderItem);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return orderItem;
	}

	public void createAll() {
		createOrderItemOne();
		createOrderItemTwo();
		createOrderItemThree();
		createOrderItemFour();
		createOrderItemFive();

	}

	//@Override
	public List<com.td.bbwp.commerce.OrderItem> getListOfRecords() {
		if (orderItems.isEmpty())
			createAll();
		return orderItems;
	}

	//@Override
	public String getQuery() {
		return "Select e from com.td.bbwp.commerce.OrderItem e ";
	}

	/*
	public  void persistAll(){
		init();
		createAll();
	
		for (com.td.bbwp.commerce.OrderItem orderItem : orderItems) {
			persist(orderItem);
		}
	}*/

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new OrderItemTestDataFactory().persistAll(); 
	}

}
