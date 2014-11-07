/**
 * 
 */
package com.yb.firm.igt.pattern.strategy;

/**
 * @author yib
 *
 */
public class MuteQuack implements QuackBehaviour {

	/* (non-Javadoc)
	 * @see com.yb.firm.igt.quack.QuackBehaviour#quack()
	 */
	@Override
	public void quack() {
		System.out.println("i am mute and never quack");
	}

}
