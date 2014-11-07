package com.yb.firm.igt.pattern.decorator;

public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		super.beverage = beverage;
	}

	@Override
	public int cost() {
		return 3 + beverage.cost();
	}
	
	@Override
	public String getDecription() {
		return "milk" + ", " + beverage.getDecription();
	}

}
