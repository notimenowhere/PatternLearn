/**
 * 
 */
package com.yb.firm.igt.pattern.strategy;

/**
 * @author yib
 *
 */
public class Squeat implements QuackBehaviour {

	/* (non-Javadoc)
	 * @see com.yb.firm.igt.quack.QuackBehaviour#quack()
	 */
	@Override
	public void quack() {

		System.out.println("big quack by bio-duck sound");
	}

}
