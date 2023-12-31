package de.unistuttgart.dsass2023.ex00.p3;

/**
 * A simple list interface
 * 
 * @param <T> The type of list element
 */
public interface ISimpleList<T extends Comparable<T>> {
	
	/**
	 * Returns the size of the list.
	 * 
	 * @return Size of the list
	 */
	public int getSize();

	/**
	 *  Appends an element to the end of the list.
	 * 
	 * @param element Element to be appended
	 */
	public void append(T element);
	
	/**
	 * Returns the element at the specified position.
	 * 
	 * @param index Index of the element (starting from 0)
	 * @throws IndexOutOfBoundsException if the given index is out of range
	 */
	public T getElement(int index);
}
