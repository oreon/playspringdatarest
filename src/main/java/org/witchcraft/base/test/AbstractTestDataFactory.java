package org.witchcraft.base.test;

import java.util.List;
import java.util.Random;

import org.witchcraft.base.entity.BaseEntity;

/** This class is the base for test data factories for various entities 
 * @author jsingh
 *
 */
public abstract class AbstractTestDataFactory<T extends BaseEntity>{
	
	public T getRandomRecord(){
		return getListOfRecords().get(new Random().nextInt(4));
	}

	public List<T> getListOfRecords() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void persistAll() {};
	
}