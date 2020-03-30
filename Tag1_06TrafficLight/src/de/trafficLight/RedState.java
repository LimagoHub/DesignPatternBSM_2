package de.trafficLight;

public class RedState extends AbstractTrafficLightState {

	public RedState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
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
