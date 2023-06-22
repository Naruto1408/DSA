package de.unistuttgart.dsass2023.ex02.p5;

public class SimpleListNode<T extends Comparable<T>> implements ISimpleListNode<T>{

	private T element;
	private SimpleListNode<T> next;

	/**
	 * Constructor for SimpleListNode class.
	 *
	 * @param element will be iterated.
	 * @param next will be iterated.
	 */
	public SimpleListNode(T element, SimpleListNode<T> next) {
		this.element = element;
		this.next = next;
	}

	/**
	 *
	 * @param element will be set to null.
	 */
	public SimpleListNode(T element) {
		this(element, null);
	}

	/**
	 *
	 * @return the Element T saved in this node
	 */
	@Override
	public T getElement() {
		return element;
	}

	/**
	 *
	 * @param element the Element to save in this node
	 */
	@Override
	public void setElement(T element) {
		this.element = element;
	}

	/**
	 * Returns the node this node points on
	 * @return next element.
	 */
	@Override
	public ISimpleListNode<T> getNext() {
		return next;
	}

	/**
	 * Sets the node, this node is pointing on
	 * @param node the node to point on
	 */
	@Override
	public void setNext(ISimpleListNode<T> node) {
		this.next = (SimpleListNode<T>) node;
	}

}
