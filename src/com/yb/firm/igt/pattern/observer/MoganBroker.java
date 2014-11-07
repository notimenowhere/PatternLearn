package com.yb.firm.igt.pattern.observer;

public class MoganBroker implements Observer {

	@Override
	public void update(Subject subject, Object data) {
		if (subject instanceof StockStatus) {
			System.out.println("my god. it is changing to be "
					+ data.toString());
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
