package de.text;

public class LineCounter extends FileProcessor {

	private int counter = 0;
	
	@Override
	public void process(char c) {
		if(c == '\n') counter ++;

	}

	@Override
	public void close() {
		System.out.println(counter);
	}
}
