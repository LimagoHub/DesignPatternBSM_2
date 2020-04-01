package de.main;

import de.beans.Person;

public class Main {

	public static void main(String[] args) {

		Person p = Person//
				.builder()//
				.vorname("Max")//
				.anrede("Herr")//
				.build();

		System.out.println(p);

	}

}
