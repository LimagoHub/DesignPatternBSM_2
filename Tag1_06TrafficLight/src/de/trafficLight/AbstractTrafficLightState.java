package de.trafficLight;

public class AbstractTrafficLightState implements TrafficLightState {

	private final TrafficLight trafficLight;
	
	public AbstractTrafficLightState(final TrafficLight trafficLight) {
	
		this.trafficLight = trafficLight;
	}

	@Override
	public String getColor() {
		throw new UnsupportedOperationException("Upps");
	}

	@Override
	public void nextColor() {
		throw new UnsupportedOperationException("Upps");

	}

	public TrafficLight getTrafficLight() {
		return trafficLight;
	}
	
	

}
