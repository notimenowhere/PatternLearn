package com.yb.firm.igt.pattern.singleton;

// Thread safe with low performance
public class SingletonDelayS {

	private static SingletonDelayS uniqueInstance = null;
	private SingletonDelayS(){
	}
	
	public synchronized static SingletonDelayS getUniqueInstance()
	{
		if( uniqueInstance == null ) {
			uniqueInstance = new SingletonDelayS();
		}
		return uniqueInstance;
	}

}
