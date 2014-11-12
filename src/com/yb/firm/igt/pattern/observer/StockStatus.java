/**
 * 
 */
package com.yb.firm.igt.pattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yib
 *
 */
public class StockStatus implements Subject {

	Set<Observer> observers;
	
	public StockStatus() {
		observers = new HashSet<Observer>();
	}

	@Override
	public void addObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObservers(Object data) {
		for( Observer observer : observers ) {
			observer.update(this, data);
		}
	}
	

}
