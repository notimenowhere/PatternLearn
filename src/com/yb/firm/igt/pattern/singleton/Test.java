package com.yb.firm.igt.pattern.singleton;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println( SingletonDelayS.getUniqueInstance() == SingletonDelayS.getUniqueInstance());
		System.out.println( SingletonDelayD.getInstance() == SingletonDelayD.getInstance());
		System.out.println( SingletonRush.getInstance() == SingletonRush.getInstance());
		
	}
}
