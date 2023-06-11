package de.unistuttgart.dsass2023.ex00.p3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is SimpleListSkippingIterator class.
 *
 * @param <T> The type of list element.
 */
public class SimpleListSkippingIterator<T extends Comparable<T>> implements Iterator<T> {
    private final List<T> lists;
    private int position;
    private final int skip;

    /**
     * Constructor of the class.
     *
     * @param lists will be initialized.
     */
    public SimpleListSkippingIterator(List<T> lists, int skip) {
        this.lists = lists;
        this.position = skip;
        this.skip = skip;
    }

    /**
     * This method check if the List have next element.
     *
     * @return true if found next element.
     */
    @Override
    public boolean hasNext() {
        /*
        return (position+skip) < lists.size();
         */
        return (position+skip) < lists.size();
    }

    /**
     * This method return next element of the List.
     *
     * @throws NoSuchElementException if there is no next element.
     * @return the n element of the List.
     */
    @Override
    public T next() {
        if (hasNext()) {
            T str = lists.get(position);
            position+=skip;
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

}
