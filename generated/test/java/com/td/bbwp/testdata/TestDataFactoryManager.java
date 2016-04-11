package com.td.bbwp.testdata;

import java.util.List;
import java.util.ArrayList;
import org.witchcraft.base.test.AbstractTestDataFactory;

public class TestDataFactoryManager {

	public static List<AbstractTestDataFactory> listDataFactory = new ArrayList<AbstractTestDataFactory>();

	static {

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.EmployeeTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.DepartmentTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.CustomerTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.CustomerOrderTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.ProductTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.OrderItemTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.PaymentMethodTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.CreditCardTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.commerce.testdata.PayPalTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.users.testdata.AppUserTestDataFactory());

		listDataFactory
				.add(new com.td.bbwp.users.testdata.AppRoleTestDataFactory());

	}

	public void persist() {
		for (AbstractTestDataFactory dataFactory : listDataFactory) {
			dataFactory.persistAll();
		}
	}

	/** Execute this method to manually generate objects
	 * @param args
	 */
	public static void main(String args[]) {
		//new TestDataGenerator().persist();
	}

}
