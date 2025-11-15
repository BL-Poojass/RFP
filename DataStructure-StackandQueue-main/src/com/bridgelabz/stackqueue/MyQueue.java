package com.bridgelabz.stackqueue;

import java.util.LinkedList;

public class MyQueue<T> {
    private final Linkedlist<T> list = new Linkedlist<>();

    public void enqueue(T data) {
        list.append(data); // adds to tail
    }

    public T dequeue() {
        return list.pop(); // removes from head
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void printQueue() {
        list.printList();
    }
}

