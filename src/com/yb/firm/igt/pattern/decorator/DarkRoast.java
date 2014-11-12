package com.yb.firm.igt.pattern.decorator;

public class DarkRoast implements Beverage {

	@Override
	public String getDecription() {
		return "DarkRoast";
	}
	
	@Override
	public int cost() {
		return (int) 8.6;
	}

}
