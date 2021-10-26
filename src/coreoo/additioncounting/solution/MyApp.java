package coreoo.additioncounting.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class MyApp {

	public static void myAlgo(Collection c) {
		c.add("abc");
		// some other logic
		c.add("xyz");
		// logic
		c.remove("abc");
	}

	public static void main(String[] args) {
		Collection dataSet = callSomelayer();
		
		RemovalCounter rcounter = new RemovalCounter(dataSet);
		AdditionCounter acounter = new AdditionCounter(rcounter);
		
		myAlgo(acounter);

		System.out.println("Number of added elements is " + acounter.getCount());
		System.out.println("Number of removed elements is " + rcounter.getCount());
	}

	private static Collection callSomelayer() {

		return new ArrayList();
	}

	private static Collection callSomeOtherlayer() {

		return new LinkedList();
	}

}
