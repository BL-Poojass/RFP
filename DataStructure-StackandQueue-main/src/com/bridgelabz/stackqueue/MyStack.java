package com.bridgelabz.stackqueue;



public class MyStack<T> {
    private final Linkedlist<T> list = new Linkedlist<>();

    public void push(T data) {
        list.add(data); // adds to head
    }

    public T pop() {
        return list.pop(); // removes from head
    }

    public T peek() {
        return list.getHead() != null ? list.getHead().data : null;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void printStack() {
        list.printList();
    }
}
