package day29collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
     /*
            1. Sometimes we need to work with first added element in a collection like in a bank customer line.
            For that kind of scenarios we prefer to use Queues because Queues are expert in "First in First out" (FIFO) scenarios.

            Note1: when you use Queue if you use in LinkedList, the elements will be in insertion order.
            Note2: when you use Queue if you use in Priority Queue, the elements will be in an order you can create.
                    We will learn how to create our own logic to put elements in order.

            2. Sometimes we need to work with first added element and last added element in a collection.
            It means we need to work double ended.
            Create Deque (Double ended Queue) and use methods with double ends like removeFirst() and removeLast()

      */

    public static void main(String[] args) {
        Queue<String> food = new LinkedList<>();
        food.add("Milk");
        food.add("Cheese");
        food.add("Meat");
        food.add("Yoghurt");
        food.add("Jam");
        System.out.println(food);//[Milk, Cheese, Meat, Yoghurt, Jam]

        //PriorityQueue is ordered in a specific order according to Java logic.
        //You can create also your own logic
        PriorityQueue<String> myFood = new PriorityQueue<>();
        myFood.add("Milk");
        myFood.add("Cheese");
        myFood.add("Meat");
        myFood.add("Yoghurt");
        myFood.add("Jam");
        System.out.println(myFood);//[Cheese, Jam, Meat, Yoghurt, Milk]

        Deque<String> yourFood = new LinkedList<>();
        yourFood.add("Milk");
        yourFood.add("Cheese");
        yourFood.add("Meat");
        yourFood.add("Yoghurt");
        yourFood.add("Jam");
        System.out.println(yourFood);//[Milk, Cheese, Meat, Yoghurt, Jam]
    }
}
