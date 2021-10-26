package coreoo.additioncounting;

import java.util.Collection;
import java.util.LinkedList;

public class AdditionCountingLinkedList extends LinkedList {
	
	private int count;
	
	@Override
	public boolean add(Object e) {
		count++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection c) {
		count += c.size();
		return super.addAll(c);
	}
	
	public int getCount() {
		return count;
	}

}
