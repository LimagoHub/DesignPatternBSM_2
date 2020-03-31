package de.trafficLight;

public class GreenState extends AbstractTrafficLightColorState {

	public GreenState(TrafficLight trafficLight) {
		super(trafficLight);
		
	}

	@Override
	public String getColor() {
		
		return "GREEN";
	}

	@Override
	public void nextColor() {
		getTrafficLight().current = getTrafficLight().redState;
	}

}
