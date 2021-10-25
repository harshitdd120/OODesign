package coreoo;

public class Cafeteria {
	
	private TemperatureController tempController;
	
	String fan;
	
	public Cafeteria() {
		tempController = new TemperatureController(fan);
		tempController.manageTemperature(30, 20);
	}
	
	public void setUpForLunch() {
		
	}

}
