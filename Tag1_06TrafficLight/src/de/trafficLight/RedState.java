package de.trafficLight;

public class RedState extends AbstractTrafficLightColorState {

	public RedState(TrafficLight trafficLight) {
		super(trafficLight);
		
	}

	@Override
	public String getColor() {
		
		return "RED";
	}

	@Override
	public void nextColor() {
		
		getTrafficLight().current = getTrafficLight().greenState;
	}

}
