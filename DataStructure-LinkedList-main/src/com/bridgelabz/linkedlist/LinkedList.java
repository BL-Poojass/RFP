package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    // UC1: Create LinkedList of 56 -> 30 -> 70
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

    // UC3: Append at the end
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

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void insertAfter(T key, T newData) {
        Node<T> temp = head;
        while (temp != null && !temp.data.equals(key)) {
            temp = temp.next;
        }
        if (temp != null) {
            Node<T> newNode = new Node<>(newData);
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) {
                tail = newNode;
            }
            size++;
        }
    }
    
    public T pop() {
        if (head == null) return null;
        T poppedData = head.data;
        head = head.next;
        if (head == null) tail = null; // list is now empty
        size--;
        return poppedData;
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
    
    public Node<T> search(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public void testInsertAfterSearch() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(70);
        list.add(30);
        list.add(56);
        list.insertAfter(30, 40);
        list.printList(); // Expected: 56 -> 30 -> 40 -> 70
    }
    
    public boolean delete(T key) {
        if (head == null) return false;

        if (head.data.equals(key)) {
            pop();
            return true;
        }

        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(key)) {
            temp = temp.next;
        }

        if (temp.next == null) return false;

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
        return true;
    }

    public int size() {
        return size;
    }






}
