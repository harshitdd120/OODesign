package coreoo.additioncounting.solution;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public abstract class CollectionDecoratorBase implements Collection {
	
	Collection core;

	public CollectionDecoratorBase(Collection core) {
		super();
		this.core = core;
	}

	public void forEach(Consumer action) {
		core.forEach(action);
	}

	public int size() {
		return core.size();
	}

	public boolean isEmpty() {
		return core.isEmpty();
	}

	public boolean contains(Object o) {
		return core.contains(o);
	}

	public Iterator iterator() {
		return core.iterator();
	}

	public Object[] toArray() {
		return core.toArray();
	}

	public Object[] toArray(Object[] a) {
		return core.toArray(a);
	}

	public Object[] toArray(IntFunction generator) {
		return core.toArray(generator);
	}

	public boolean add(Object e) {
		return core.add(e);
	}

	public boolean remove(Object o) {
		return core.remove(o);
	}

	public boolean containsAll(Collection c) {
		return core.containsAll(c);
	}

	public boolean addAll(Collection c) {
		return core.addAll(c);
	}

	public boolean removeAll(Collection c) {
		return core.removeAll(c);
	}

	public boolean removeIf(Predicate filter) {
		return core.removeIf(filter);
	}

	public boolean retainAll(Collection c) {
		return core.retainAll(c);
	}

	public void clear() {
		core.clear();
	}

	public boolean equals(Object o) {
		return core.equals(o);
	}

	public int hashCode() {
		return core.hashCode();
	}

	public Spliterator spliterator() {
		return core.spliterator();
	}

	public Stream stream() {
		return core.stream();
	}

	public Stream parallelStream() {
		return core.parallelStream();
	}
	
	

}
