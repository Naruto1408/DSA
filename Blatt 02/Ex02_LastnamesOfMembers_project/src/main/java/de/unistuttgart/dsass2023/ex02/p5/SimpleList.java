package de.unistuttgart.dsass2023.ex02.p5;

public class SimpleList<T extends Comparable<T>> implements ISimpleList<T> {

	private Node<T> head;
	private int size;

	private static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}


	/**
	 * Returns the size of the list.
	 *
	 * @return Size of the list
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * Prepends an element at the start of the list.
	 * I.e. the new element becomes element 0
	 *
	 * @param element Element to be appended
	 */
	@Override
	public void prepend(T element) {
		Node<T> newNode = new Node<>(element);
		newNode.next = head;
		head = newNode;
		size++;
	}

	/**
	 * Returns the element at the specified position.
	 *
	 * @param index Index of the element (starting from 0)
	 * @throws IndexOutOfBoundsException if the given index is out of range
	 */
	@Override
	public T getElement(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}

	/**
	 * This method sorts your list.
	 * It should use Bubble Sort, but not use any access on the list via an index,
	 * i.e. it MUST NOT use the method getElement(). It should therefore avoid the problems
	 * you stated in "Aufgabe 5 a)".
	 */
	@Override
	public void sort() {
		boolean swapped = true;
		Node<T> current;
		while (swapped) {
			swapped = false;
			current = head;
			while (current != null && current.next != null) {
				if (current.data.compareTo(current.next.data) > 0) {
					T temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;
					swapped = true;
				}
				current = current.next;
			}
		}
	}
}
