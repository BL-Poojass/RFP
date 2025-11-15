package com.bridgelabz.stackqueue;

public class Linkedlist<T> {
    Node<T> head;
    Node<T> tail;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T pop() {
        if (head == null) return null;
        T data = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return data;
    }

    public T popLast() {
        if (head == null) return null;
        if (head.next == null) {
            T data = head.data;
            head = tail = null;
            size--;
            return data;
        }

        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        T data = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return data;
    }

    public Node<T> getHead() {
        return head;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}
