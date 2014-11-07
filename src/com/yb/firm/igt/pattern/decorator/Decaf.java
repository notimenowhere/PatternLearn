package com.yb.firm.igt.pattern.decorator;

public class Decaf implements Beverage {

	@Override
	public String getDecription() {
		return "Decaf";
	}
	
	@Override
	public int cost() {
		return 10;
	}

}
