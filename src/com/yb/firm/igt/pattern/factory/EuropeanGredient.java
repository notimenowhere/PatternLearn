package com.yb.firm.igt.pattern.factory;

public class EuropeanGredient implements GredientFactory {

	@Override
	public void soy() {
		System.out.println("euro soy");
	}

	@Override
	public void salt() {
		System.out.println("euro salt");
	}

	@Override
	public void oil() {
		System.out.println("euro oil");
	}

	@Override
	public void cheese() {
		System.out.println("euro cheese");
	}

}
