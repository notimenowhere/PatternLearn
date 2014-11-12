package com.yb.firm.igt.pattern.factory;

public abstract class PizzaStore {
	
	protected GredientFactory gredientFactory;
	
	public Pizza makeOrder( String name )
	{
		Pizza pizza = productPizza( name );
		pizza.prepare();
		pizza.cook();
		pizza.box();
		System.out.println("pizza delivered" + pizza.toString());
		return pizza;
	}
	
	public abstract Pizza productPizza( String name );

}
