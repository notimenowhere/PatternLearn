package com.yb.firm.igt.pattern.decorator;

public class Mocha extends CondimentDecorator {

	public Mocha( Beverage beverage ) {
		super.beverage = beverage;
	}
	
	@Override
	public int cost() {
		return 2 + beverage.cost();
	}
	
	@Override
	public String getDecription() {
		return "mocha" + ", " + beverage.getDecription();
	}

}
