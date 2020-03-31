package de.main;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;
import de.history.CommandHistory;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CommandHistory history = new CommandHistory();
		
		while(true) {
			System.out.print("#>");
			String eingabe = scanner.nextLine();
			
			if("ende".equalsIgnoreCase(eingabe)) break;
			
			if("undo".equalsIgnoreCase(eingabe)) {
				history.undo();
				continue;
			}
			if("redo".equalsIgnoreCase(eingabe)) {
				history.redo();
				continue;
			}
			
			
			
			Command command = CommandFactory.createCommand(eingabe);
			if(command == null) continue;
			
			command.execute();
			history.add(command);
			
		}

	}

}
