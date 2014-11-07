/**
 * 
 */
package com.yb.firm.igt.pattern.strategy;


/**
 * @author yib
 *
 */
public class GreenDuck extends Duck {
	
	public GreenDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new MuteQuack();
	}
	
	@Override
	public void swim() {
		System.out.println("As a green duck, i can green swim");
	}
	
	@Override
	public void display() {
		System.out.println("beauty");
	}

}
