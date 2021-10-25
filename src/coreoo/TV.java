package coreoo;

public class TV {
	
	private TemperatureController tempController; 
	private String panel;
	String fan;
	
	public TV() {
		tempController = new TemperatureController(fan);
		tempController.manageTemperature(50, 30);
	}
	
	public void on() {
		//General TV on
	}
	
	public void off() {
		//General TV off
	}

}
