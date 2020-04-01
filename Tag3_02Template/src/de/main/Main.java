package de.main;

import de.text.CharacterCounter;
import de.text.FileCopierer;
import de.text.FileProcessor;
import de.text.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor processor = new CharacterCounter();
		
		processor.run("bayern.txt");
	}

}
