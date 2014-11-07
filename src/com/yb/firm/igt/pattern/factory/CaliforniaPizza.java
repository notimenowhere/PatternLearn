package com.yb.firm.igt.pattern.factory;

public class CaliforniaPizza extends Pizza {

	public CaliforniaPizza(GredientFactory gredientFactory) {
		setName("california pizza");
		setGredientFactory(gredientFactory);
	}
	
	@Override
	public void prepare() {
		getGredientFactory().soy();
		getGredientFactory().salt();
		getGredientFactory().oil();
		getGredientFactory().cheese();
		System.out.println("california source is prepared.");
	}
}
