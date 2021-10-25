package coreoo.ocp.after;

import java.util.HashMap;
import java.util.Map;

public class NotePadApp {
	
	private static Map<String,MenuHandler> handlers = new HashMap<String, MenuHandler>();
	
	public static void registerHandler(String label,MenuHandler h) {
		handlers.put(label, h);
	}

	public void handleEvent(MenuEvent me) {
		String label = me.getLabel();
		MenuHandler handler = handlers.get(label);
		handler.handleMenuClick();
		
	}

	
}
