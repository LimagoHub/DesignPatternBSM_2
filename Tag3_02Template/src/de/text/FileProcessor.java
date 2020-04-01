package de.text;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	
	private List<CharacterHandler> handlers = new ArrayList<>();
	
	public void addCharacterHandler(CharacterHandler handler) {
		handlers.add(handler);
	}

	
	public final void run(String filename) {
		
		try(FileReader reader = new FileReader(filename)) {
			
			init();
			
			int c;
			
			while( (c=reader.read()) != -1) {
				process((char) c);
			}
			
			close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void init() {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.init();
		}
	}
	
	private  void process(char c) {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.process(c);
		}
	}

	private void close() {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.close();
		}
	}
}
