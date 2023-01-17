package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public static void main(String[] args) {

        Queue<Integer> firstQueue = new LinkedList<>(Arrays.asList(1, 5, 7, 6));
        Queue<Integer> secondQueue = new LinkedList<>(Arrays.asList(2, 5, 8, 3));

        ArrayDequeCreator arrayDequeCreator = new ArrayDequeCreator();
        arrayDequeCreator.createArrayDeque(firstQueue, secondQueue);
    }

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> myArrayDeque = new ArrayDeque<>();
        myArrayDeque.offerLast(firstQueue.remove());
        myArrayDeque.offerLast(firstQueue.remove());
        myArrayDeque.offerLast(secondQueue.remove());
        myArrayDeque.offerLast(secondQueue.remove());

        while (!firstQueue.isEmpty()) {
            firstQueue.add(myArrayDeque.removeLast());
            myArrayDeque.offerLast(firstQueue.remove());
            myArrayDeque.offerLast(firstQueue.remove());

            secondQueue.add(myArrayDeque.removeLast());
            myArrayDeque.offerLast(secondQueue.remove());
            myArrayDeque.offerLast(secondQueue.remove());
        }
        return myArrayDeque;
    }
}
