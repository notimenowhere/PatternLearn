package com.yb.firm.igt.pattern.factory;

public class CaliforniaPizzaStore extends PizzaStore {

	public CaliforniaPizzaStore() {
		gredientFactory = new ChinaGredient();
	}
	
	@Override
	public Pizza productPizza(String name) {
		if( name.equalsIgnoreCase("california") ) {
			return new CaliforniaPizza(gredientFactory);
		} else if ( name.equalsIgnoreCase("california-cheese")) {
			return new CaliforniaCheesePizza(gredientFactory);
		} else {
			return new CaliforniaPizza(gredientFactory);
		}
		
	}

}
