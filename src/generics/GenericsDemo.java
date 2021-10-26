package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsDemo {
	
	
	public static <T> List<T> buildAList(T first,T second) {
		List<T> list = new ArrayList<T>();
		list.add(first);
		list.add(second);
		return list;
	}
	
	public static <T> T pickBetterOfTheTwo(T first,T second) {
		
		return null;
	}
	
	public static void printAll(List<?> l) {
		
	}
	
	public static double sumOfList(List<? extends Number> numList) {
		double sum = 0;
		for(Number aNum : numList) {
			sum += aNum.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("zebra");
		l.add("abc");
		l.add("xylophone");
		
		Collections.sort(l);
		
		Collections.sort(l, new StringLengthComparator());
		
		System.out.println(l);
		
		
//		l.add(234);
		
		String first = l.get(0);
//		Integer second = (Integer) l.get(1);
		
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(123);
		iList.add(234);
		
		double sum = sumOfList(iList);
		System.out.println(sum);
		
		List<Float> fList = new ArrayList<Float>();
		fList.add(123.0f);
		fList.add(4556f);
		
		sum = sumOfList(fList);
		System.out.println(sum);
		
		Integer i = 123;
		Float f = 234f;
		
		Number n = f;
		
		printAll(iList);
		printAll(fList);
		printAll(l);
		
		String betterGreeting = (String) pickBetterOfTheTwo("hi", "hello");
		
		Integer betterWakeupTime = (Integer) pickBetterOfTheTwo(8, 6);
		
		String betterString = (String) pickBetterOfTheTwo("hi", 10);
	}

}
