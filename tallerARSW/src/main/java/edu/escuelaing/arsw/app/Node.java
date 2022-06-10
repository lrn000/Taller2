package edu.escuelaing.arsw.app;

public class Node<E> {
    private E value;
    private Node<E> next;

    /**
     * Constructor of class Node
     * @param e value of the node
     */
    public Node(E e) {
        value = e;
        next = null;
    }

    /**
     * Get the value of the current node
     * @return value of the node
     */
    public E getValue() {
        return value;
    }

    /**
     * Get the next Node
     * @return next Node
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Set the next Node
     * @param next node next to the current node
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Set the value
     * @param value value
     */
    public void setValue(E value) {
        this.value = value;
    }
}
