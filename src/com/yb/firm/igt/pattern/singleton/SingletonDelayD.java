package com.yb.firm.igt.pattern.singleton;

//Thread safe with nice performance
public class SingletonDelayD {

	private static volatile SingletonDelayD instance = null;
	private SingletonDelayD(){
	}
	
	public static SingletonDelayD getInstance()
	{
		if( instance == null ) { 
			synchronized (SingletonDelayD.class) {
				if( instance == null ) {
					instance = new SingletonDelayD();
				}				
			}
		}
		return instance;
	}
}
