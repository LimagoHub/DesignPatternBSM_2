package de.history;

import de.commands.Command;

public class CommandHistory {
	
	public void add(Command command) {
		if(command.isQuery()) return;
		
		// TODO Insert Code
		
	}
	
	public void undo() {
		System.out.println("can't undo");
	}

	public void redo() {
		System.out.println("can't undo");
	}

}
