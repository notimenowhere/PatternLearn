package com.yb.firm.igt.pattern.factory;

public class CaliforniaCheesePizza extends Pizza {
	
	
	
	public CaliforniaCheesePizza(GredientFactory gredientFactory) {
		setName("california cheese pizza");
		setGredientFactory(gredientFactory);
	}

	@Override
	public void prepare() {
		getGredientFactory().salt();
		getGredientFactory().soy();
		getGredientFactory().oil();
		getGredientFactory().cheese();
		System.out.println("california cheese source is prepared");
	}

}
