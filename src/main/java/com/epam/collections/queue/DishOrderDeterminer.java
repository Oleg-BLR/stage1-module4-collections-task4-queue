package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public static void main(String[] args) {
        DishOrderDeterminer dishOrderDeterminer = new DishOrderDeterminer();
        dishOrderDeterminer.determineDishOrder(11, 4);
    }

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> determinedOrder = new LinkedList<>();
        Queue<Integer> initialOrder = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            initialOrder.add(i);
        }
        System.out.println(initialOrder);
        int restNumber = 0;
        while (!initialOrder.isEmpty()) {
        int i = 1 + restNumber;
        Queue<Integer> tempInitialOrder = initialOrder;
        List<Integer> toRemove = new ArrayList<>();
        for (Integer element : initialOrder) {
                if (i % everyDishNumberToEat == 0) {
                    restNumber = -1;
                    determinedOrder.add(element);
                    toRemove.add(element);
                }
                i++;
                restNumber++;
            }
        tempInitialOrder.removeAll(toRemove);
        initialOrder = tempInitialOrder;
        }
        return determinedOrder;
    }
}


