/**
 * 
 */
package com.yb.firm.igt.pattern.strategy;

/**
 * @author yib
 *
 */
public class FlyDisabled implements FlyBehaviour {

	/* (non-Javadoc)
	 * @see com.yb.firm.igt.FlyBehaviour#performFly()
	 */
	@Override
	public void performFly() {
		// TODO Auto-generated method stub
		System.out.println("I can't Fly");
	}

}
