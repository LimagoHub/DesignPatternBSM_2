package de.main;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main {
	
	private Metzger metzger = new Metzger();

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Schwein piggy = new Schwein("Miss Piggy");
		piggy.addPigTooFatListener(e->metzger.schlachten(e));
		for (int i = 0; i < 15; i++) {
			piggy.fressen();
		}
		
	}
	
	class SchweineMetzgerAdapter implements PigTooFatListener{

		@Override
		public void pigTooFat(Schwein s) {
			metzger.schlachten(s);
			
		}
		
	}

}



class Metzger  {

	public void schlachten(Object tier) {
		System.out.println("Messer wetz!");
	}
	
}
