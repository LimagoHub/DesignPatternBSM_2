package de.trafficLight;

public class OffState extends AbstractTrafficLightState {

	public OffState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void switchOn() {
		getTrafficLight().current = getTrafficLight().redState;
	}
	

}
