package de.commands;

import de.math.Calculator;

public class ClearCommand extends AbstractCommand {
	
	private double memory;

	@Override
	public void execute() {
		memory = Calculator.getInstance().getMemory();
		Calculator.getInstance().clear();

	}
	
	
	@Override
	public void undo() {
		Calculator.getInstance().setMemory(memory);
	}

	
	@Override
	public boolean isQuery() {
		
		return false;
	}
}
