/**
 * 
 */
package com.yb.firm.igt.pattern.strategy;

/**
 * @author yib
 *
 */
public class FlyWithWings implements FlyBehaviour {

	/* (non-Javadoc)
	 * @see com.yb.firm.igt.FlyBehaviour#performFly()
	 */
	@Override
	public void performFly() {
		System.out.println("I am flying with wings");

	}

}
