package de.commands;

public abstract class AbstractCommand implements Command {

	@Override
	public void parse(String[] tokens) {
		// ok

	}

	
	@Override
	public void undo() {
		new UnsupportedOperationException("Häh?");

	}

	@Override
	public boolean isQuery() {
		
		return true;
	}

}
