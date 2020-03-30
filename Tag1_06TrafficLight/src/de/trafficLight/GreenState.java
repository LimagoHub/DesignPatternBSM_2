package de.trafficLight;

public class GreenState extends AbstractTrafficLightState {

	public GreenState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
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
