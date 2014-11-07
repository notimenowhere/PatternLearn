package com.yb.firm.igt.pattern.factory;

public abstract class Pizza {
	
	private String name = "pizza";
	private GredientFactory gredientFactory;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGredientFactory(GredientFactory gredientFactory) {
		this.gredientFactory = gredientFactory;
	}
	
	public GredientFactory getGredientFactory() {
		return gredientFactory;
	}
	
	public String getName() {
		return name;
	}
	
	public void prepare()
	{
		System.out.println("the source is prepared");
	}
	
	public void cook()
	{
		System.out.println("the pizza is cooked");
	}
	
	public void box()
	{
		System.out.println("the pizza is boxed");
	}
	
}
