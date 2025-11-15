package com.bridgelabz.stackqueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stack Demo:");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack(); // 56 -> 30 -> 70

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("\nQueue Demo:");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue(); // 56 -> 30 -> 70

        System.out.println("Dequeued: " + queue.dequeue()); // 56
        queue.printQueue(); // 30 -> 70
    }
}

