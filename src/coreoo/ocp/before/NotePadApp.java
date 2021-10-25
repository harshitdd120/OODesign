package coreoo.ocp.before;

public class NotePadApp {

	public void handleEvent(MenuEvent me) {
		String label = me.getLabel();
		if(label.equalsIgnoreCase("new")) {
			//new logic
		}else if(label.equalsIgnoreCase("save")) {
			//save logic
		}else if(label.equalsIgnoreCase("open")) {
			//open logic
		}
		
		
	}

	
	public void handleNew() {
		
	}
}
