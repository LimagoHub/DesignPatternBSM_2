package de.client;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import de.tiere.Schwein;

public class Main {

	public static void main(String[] args) throws Exception{

		Class clazz;
		
		// 1. Fall
		clazz = Schwein.class;
		
		// 2. Fall
		Schwein s = new Schwein();
		clazz = s.getClass();
		
		// 3.Fall
		clazz = Class.forName("de.tiere.Schwein");
		
		System.out.println(clazz.getSimpleName());
		
		System.out.println("#####################");
		
		Method [] methods  = clazz.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("#####################");
		methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("#####################");
		Object object = clazz.newInstance();
		
		System.out.println(object);
		
		Constructor<?> ctor = clazz.getConstructor(String.class);
		object = ctor.newInstance("Miss Piggy");
		System.out.println(object);
		
		Method myMethod = clazz.getMethod("fressen");
		myMethod.invoke(object);
		System.out.println(object);
		
		myMethod = clazz.getDeclaredMethod("setGewicht", int.class);
		myMethod.setAccessible(true);
		myMethod .invoke(object, -100);
		
		System.out.println(object);
		
		
		
		
	}

}
