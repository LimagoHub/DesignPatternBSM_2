package de.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {
	
	private static List<AttributedCharacter> characters = new ArrayList<>();
	
	private final char c;
	private final boolean bold;
	
	private AttributedCharacter(char c, boolean bold) {
		this.c = c;
		this.bold = bold;
		characters.add(this);
	}

	
	public static AttributedCharacter getInstance(char c, boolean bold) {
		for (AttributedCharacter character : characters) {
			if(character.c == c && character.bold == bold)
				return character;
		}
		
		return new AttributedCharacter(c, bold);
	}


	public char getC() {
		return c;
	}


	public boolean isBold() {
		return bold;
	}
	
	
}
