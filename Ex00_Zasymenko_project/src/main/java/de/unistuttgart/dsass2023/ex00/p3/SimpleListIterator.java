package de.unistuttgart.dsass2023.ex00.p3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is SimpleListIterator class.
 *
 * @param <T> The type of list element.
 */
public class SimpleListIterator<T extends Comparable<T>> implements Iterator<T>, ISimpleListIterable<T> {
    private final List<T> lists;
    private int position;

    /**
     * Constructor of the class.
     *
     * @param lists will be iterated.
     */
    public SimpleListIterator(List<T> lists) {
        this.lists = lists;
        this.position = 0;
    }

    /**
     * This method check if the List have next element.
     *
     * @return true if found next element.
     */
    @Override
    public boolean hasNext() {
        return position < lists.size();
    }

    /**
     * This method return next element of the List.
     *
     * @throws NoSuchElementException if there is no next element.
     * @return the next element of the List.
     */
    @Override
    public T next() {
        if (hasNext()) {
            T str = lists.get(position);
            position++;
            return str;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * This method throws an UnsupportedOperationException as the remove operation is not supported.
     *
     * @throws UnsupportedOperationException .
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the size of the list.
     *
     * @return Size of the list
     */
    @Override
    public int getSize() {
        return lists.size();
    }

    /**
     *  Appends an element to the end of the list.
     *
     * @param element Element to be appended
     */
    @Override
    public void append(T element) {
        lists.add(element);
    }

    /**
     * Returns the element at the specified position.
     *
     * @param index Index of the element (starting from 0)
     * @throws IndexOutOfBoundsException if the given index is out of range
     */
    @Override
    public T getElement(int index) {
        if(index>lists.size()){
            throw new IndexOutOfBoundsException();
        }
        return lists.get(index);
    }
}
