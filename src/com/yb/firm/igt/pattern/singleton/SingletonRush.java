package com.yb.firm.igt.pattern.singleton;

public class SingletonRush {

	private static SingletonRush instance = new SingletonRush();
	private SingletonRush(){
	}
	
	public static SingletonRush getInstance()
	{
		return instance;
	}
}
