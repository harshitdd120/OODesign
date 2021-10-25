package coreoo.lsp.before;

import java.io.IOException;

import coreoo.lsp.before.framework.Printer;

public class MyApp {
	
	public void printToDoList(Printer p) {
		p.on();
		
		
		p.print("todo.txt");
		
	}

}
