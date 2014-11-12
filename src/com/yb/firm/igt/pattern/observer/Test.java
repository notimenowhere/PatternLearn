/**
 * 
 */
package com.yb.firm.igt.pattern.observer;

/**
 * @author yib
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new StockStatus();
		Observer ob1 = new MoganBroker();
		Observer ob2 = new BankBroker();
		ob1.register(subject);
		ob2.register(subject);
		subject.notifyObservers(new Integer(2400));
		ob1.unregister(subject);
		subject.notifyObservers(new Integer(600));
	}
}
