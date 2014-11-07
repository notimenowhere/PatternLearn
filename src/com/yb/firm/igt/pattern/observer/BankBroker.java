package com.yb.firm.igt.pattern.observer;

public class BankBroker implements Observer {

	@Override
	public void update(Subject subject, Object data) {
		if( subject instanceof StockStatus ) {
			System.out.println("Yes. it is changing to " + data.toString());
		}
	}

	@Override
	public void register(Subject subject) {
		subject.addObserver(this);
	}

	@Override
	public void unregister(Subject subject) {
		subject.removeObserver(this);
	}
}
