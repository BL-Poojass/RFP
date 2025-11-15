package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {
        OrderedLinkedList<Integer> orderedList = new OrderedLinkedList<>();
        orderedList.add(56);
        orderedList.add(30);
        orderedList.add(40);
        orderedList.add(70);

        orderedList.printList(); // Output: 30 -> 40 -> 56 -> 70
    }
}

