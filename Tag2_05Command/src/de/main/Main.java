package de.main;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("#>");
			String eingabe = scanner.nextLine();
			
			if("ende".equalsIgnoreCase(eingabe)) break;
			
			Command command = CommandFactory.createCommand(eingabe);
			if(command != null)
				command.execute();
			
		}

	}

}
