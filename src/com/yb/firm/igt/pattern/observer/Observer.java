/**
 * 
 */
package com.yb.firm.igt.pattern.observer;

/**
 * @author yib
 *
 */
public interface Observer {
	
	public void register( Subject subject );
	
	public void unregister( Subject subject );
	
	public void update(Subject subject, Object data);

}
