package de.unistuttgart.dsass2023.ex00.p3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SimpleList<T extends Comparable<T>> implements ISimpleListIterable<T> {

	/** Do not modify the existing methods and signatures */
	private final List<T> list;

	public SimpleList() {
		list = new ArrayList<T>();
	}

	@Override
	public void append(T element) {
		list.add(element);
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public T getElement(int index) {
		return list.get(index);
	}

	/**
	 * Returns an iterator that enumerates every
	 * element in the collection, starting with the
	 * first element.
	 *
	 * @return the iterator.
	 */
	@Override
	public Iterator<T> iterator() {
		return new SimpleListIterator<>(list);
	}

	/**
	 * Returns an iterator that enumerates every n-th
	 * element in the collection, starting with the
	 * first element.
	 *
	 * @param numberSkippedElements the number of skipped elements+1.
	 * @return the iterator.
	 * @throws IllegalArgumentException if numberSkippedElements is less than 1.
	 */
	@Override
	public Iterator<T> skippingIterator(int numberSkippedElements) {
		if(numberSkippedElements<1){
			throw new IllegalArgumentException();
		}
		return new SimpleListSkippingIterator<>(list, numberSkippedElements);
	}
}
