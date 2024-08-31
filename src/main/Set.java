package main;

import java.util.*;

public class Set<T> implements Iterable<T> {
	private T[] _elements;
	
	public Set(T[] elements) {
		HashMap<T, Boolean> dict = new HashMap<T, Boolean>();
		for(T element : elements) {
			if (!dict.containsKey(element)) {
				dict.put(element, true);
			}
		}
		_elements = (T[])(dict.keySet().toArray());
	}
	
	public T get(int index) {
		if ((index < 0)
				|| (index >= _elements.length)) {
			throw new IndexOutOfBoundsException(index);
		}
		
		return _elements[index];
	}
	
	public int length() {
		return _elements.length;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new SetIterator<T>();
	}
	
	private class SetIterator<T> implements Iterator<T> {

		private int _position = -1;
		
		private Set<T> _elements;
		
		public SetIterator() {
			_elements = (Set<T>)Set.this;
		}
		
		@Override
		public boolean hasNext() {
			return (_position < (_elements._elements.length - 1));
		}

		@Override
		public T next() {
			_position++;
			return _elements.get(_position);
		}
	}
}
