package com.fmi.se.dsa;

/**
 *
 * @author Dimitar
 * @param <T>
 */
public class Node<T> {

    private T data;
    private Node<T> next;

    public Node() {
        this.data = null;
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(Node other) {
        this.data = (T) other.data;
        this.next = other.next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}