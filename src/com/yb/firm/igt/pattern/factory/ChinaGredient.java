package com.yb.firm.igt.pattern.factory;

public class ChinaGredient implements GredientFactory {

	@Override
	public void soy() {
		System.out.println("chinese soy");
	}

	@Override
	public void salt() {
		System.out.println("chinese salt");
	}

	@Override
	public void oil() {

		System.out.println("chinese oil");
	}

	@Override
	public void cheese() {

		System.out.println("chinese cheese");
	}

}
