package de.commands;

public class CommandFactory {
	
	
	private static final String PREFIX = "de.commands.";
	private static final String SUFFIX = "Command";
	
	public static Command createCommand(String eingabe) {
		
		
		
		try {
			String [] tokens = eingabe.split(" ");
			Command retval = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).newInstance();
			retval.parse(tokens);
			
			
			return retval;
		} catch (Throwable e) {
			
			e.printStackTrace();
			return null;
		}
	}

}
