package de.main;

import de.text.CharacterCounter;
import de.text.FileCopierer;
import de.text.FileProcessor;
import de.text.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor processor = new FileProcessor();
		processor.addCharacterHandler(new CharacterCounter());
		processor.addCharacterHandler(new LineCounter());
		processor.addCharacterHandler(new FileCopierer());
		
		processor.run("bayern.txt");
	}

}
