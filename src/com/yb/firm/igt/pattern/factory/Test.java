package com.yb.firm.igt.pattern.factory;

public class Test {

	public static void main(String[] args) {
		
		PizzaStore store = new CaliforniaPizzaStore();
		Pizza pizza = store.makeOrder("california-cheese");
		System.out.println(pizza.getName());

		System.out.println("---------------");
		
		pizza = store.makeOrder("california");
		System.out.println(pizza.getName());
		
		System.out.println("---------------");
		store = new BostonPizzaStore();
		pizza = store.makeOrder("boston");
		System.out.println(pizza.getName());

	}

}
