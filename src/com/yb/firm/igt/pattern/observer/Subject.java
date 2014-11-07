/**
 * 
 */
package com.yb.firm.igt.pattern.observer;


/**
 * @author yib
 *
 */
public interface Subject 
{
	public void addObserver(Observer ob);
	public void removeObserver(Observer ob);
	public void notifyObservers(Object data);
}
