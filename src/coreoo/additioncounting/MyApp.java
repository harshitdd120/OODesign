package coreoo.additioncounting;

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

		myAlgo(dataSet);

		System.out.println("Number of added elements is " + ((AdditionCountingArraylist) dataSet).getCount());
	}

	private static Collection callSomelayer() {

		return new AdditionCountingArraylist();
	}

	private static Collection callSomeOtherlayer() {

		return new AdditionCountingLinkedList();
	}

}
