package coreoo.additioncounting.solution;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AdditionCounter extends CollectionDecoratorBase {
	
	
	
	int count;

	public AdditionCounter(Collection core) {
		super(core);
	}

	public int getCount() {
		return count;
	}
	
	public boolean add(Object e) {
		count++;
		return core.add(e);
	}

	public boolean addAll(Collection c) {
		count += c.size();
		return core.addAll(c);
	}
	
	
}
