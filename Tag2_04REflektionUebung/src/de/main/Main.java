package de.main;

import de.beanfactory.BeanCreator;

public class Main {

	public static void main(String[] args) {
		BeanCreator creator = new BeanCreator();
		
		Object object = creator.createAndFillBean("de.beans.Person");
		
		System.out.println(object);
	}

}
