package edu.escuelaing.arsw.app;

import java.io.Serializable;
import java.util.*;

public class LinkedList<E> implements  List<E>, Deque<E>, Cloneable, Serializable {

    private Node<E> root;
    private Node<E> tail;
    private int size;

    /**
     *  Constructor of the class LinkedList
     */
    public LinkedList() {
        root = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    /**
     * Gets the first element.
     */
    @Override
    public E getFirst() {
        return root.getValue();
    }

    /**
     * Gets the last element.
     */
    @Override
    public E getLast() {
        return tail.getValue();
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    /**
     *  returns the size of the list
     * @return the number of data contained in the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     *  check if the list is empty
     * @return true if root is null false if root is not null
     */
    @Override
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    /**
     * returns an iterator over the elements of the list
     * @return an iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentNode = root;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                if(hasNext()) {
                    E value = currentNode.getValue();
                    currentNode = currentNode.getNext();
                    return value;
                }
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Add data to the list
     * @return true if root is null false if root is not null
     */
    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node(e);
        if (isEmpty()) {
            root = newNode;
            newNode.setNext(null);
            root = newNode;
            size=1;
        } else {
            tail.setNext(newNode);
            size=size+1;
        }
        tail = newNode;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
