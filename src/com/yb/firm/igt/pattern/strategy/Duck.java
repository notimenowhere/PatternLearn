package com.yb.firm.igt.pattern.strategy;


public abstract class Duck {
	
	private int weight;
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void fly()
	{
		flyBehaviour.performFly();
	}
	
	public void quack()
	{
		quackBehaviour.quack();
	}
	
	public void swim()
	{
		System.out.println("as a duck i can swim");
	}
	
	public abstract void display();
	

}
