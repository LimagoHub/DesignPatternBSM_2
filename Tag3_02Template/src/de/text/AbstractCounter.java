package de.text;

public abstract class AbstractCounter extends FileProcessor {

	protected int counter;
	
	@Override
	public void init() {
		counter =0 ;
	}

	public void close() {
		System.out.println(counter);
	};
}
