package de.client;

import de.trafficLight.TrafficLight;

public class Client {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(trafficLight.getColor());
			trafficLight.nextColor();
		}

	}

}
