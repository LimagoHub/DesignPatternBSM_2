package de.commands;

public class CommandFactory {
	
	public static Command createCommand(String eingabe) {
		
		try {
			Command retval = null;
			String [] tokens = eingabe.split(" ");
			
			if(tokens[0].equals("Add")) {
				retval = new AddCommand();
				retval.parse(tokens);
			} else if (tokens[0].equals("Print")) { 
				retval = new PrintCommand();
				retval.parse(tokens);
			}
			
			return retval;
		} catch (Throwable e) {
			
			e.printStackTrace();
			return null;
		}
	}

}
