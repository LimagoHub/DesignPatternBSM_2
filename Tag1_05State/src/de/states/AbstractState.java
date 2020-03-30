package de.states;

public class AbstractState implements State {
	
	
	private final Front front;
	
	

	public AbstractState(Front front) {
		this.front = front;
	}

	@Override
	public void drucken() {
		throw new UnsupportedOperationException("Upps");

	}

	@Override
	public void changeToA() {
		throw new UnsupportedOperationException("Upps");

	}

	@Override
	public void changeToB() {
		throw new UnsupportedOperationException("Upps");

	}

	public Front getFront() {
		return front;
	}
	
	

}
