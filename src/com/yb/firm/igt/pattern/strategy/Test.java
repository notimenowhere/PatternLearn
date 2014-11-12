package com.yb.firm.igt.pattern.strategy;

public class Test {

	public static void main(String[] args) {
		Duck duck = new GreenDuck();
		duck.swim();
		duck.quack();
		duck.fly();
	}
}
