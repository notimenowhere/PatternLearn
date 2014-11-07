package com.yb.firm.igt.pattern.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		return 1 + beverage.cost();
	}
	
	@Override
	public String getDecription() {
		return "whip" + ", " + beverage.getDecription();
	}

}
