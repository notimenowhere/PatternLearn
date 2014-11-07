package com.yb.firm.igt.pattern.factory;

public class BostonPizzaStore extends PizzaStore {

	public BostonPizzaStore() {
		gredientFactory = new EuropeanGredient();
	}
	
	@Override
	public Pizza productPizza(String name) {
		return new BostonPizza(gredientFactory);
	}

}
