package coreoo.additioncounting;

import java.util.ArrayList;
import java.util.Collection;

public class AdditionCountingArraylist extends ArrayList {
	
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
