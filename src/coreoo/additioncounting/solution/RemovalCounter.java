package coreoo.additioncounting.solution;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class RemovalCounter extends CollectionDecoratorBase{
	
	
	
	int count;

	public RemovalCounter(Collection core) {
		super(core);
	}

	public int getCount() {
		return count;
	}
	
	

	public boolean remove(Object o) {
		count++;
		return core.remove(o);
	}

	

	public boolean removeAll(Collection c) {
		count += c.size();
		return core.removeAll(c);
	}

	
}
