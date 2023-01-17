package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
//    public static void main(String[] args) {
////        List<String> firstList = new LinkedList<>(Arrays.asList("Java", "PriorityQueue", "class"));
//        List<String> firstList = new LinkedList<>(Arrays.asList("The", "Java", "PriorityQueue", "class"));
//        System.out.println(firstList);
////        List<String> secondList = new LinkedList<>(Arrays.asList("It", "is", "different", "from", "standard", "queues", "where", "FIFO"));
//        List<String> secondList = new LinkedList<>(Arrays.asList("Objects", "are", "processed", "based", "on", "their", "priority"));
//        System.out.println(secondList);
//        PriorityQueue<String> combinedList = new PriorityQueue<String>(Collections.reverseOrder());
//        combinedList.addAll(firstList);
//        combinedList.addAll(secondList);
//        System.out.println(combinedList);
//    }

    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> combinedList = new PriorityQueue<String>(Collections.reverseOrder());
        combinedList.addAll(firstList);
        combinedList.addAll(secondList);
        System.out.println(combinedList);

        return combinedList;
    }
}
