package com.yb.firm.igt.pattern.factory;

public class BostonPizza extends Pizza {
	
	public BostonPizza(GredientFactory gredientFactory) {
		setName("boston pizza");
		setGredientFactory(gredientFactory);
	}
	
	@Override
	public void prepare() {
		getGredientFactory().soy();
		getGredientFactory().salt();
		getGredientFactory().oil();
		getGredientFactory().cheese();
		System.out.println("Boston source is prepared");
	}
}
