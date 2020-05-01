package com.zufrost.learn.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {
            {
                this.offer("Jeans");
            }
        };
        queue.add("Dress");
        queue.offer("T-Shirt");
        queue.forEach(System.out::println);
        queue.remove("Dress");
        System.out.println();
        queue.forEach(System.out::println);
//        queue.clear();
//        queue.element();
        System.out.println();
//        queue.removeIf(s -> s.endsWith("t"));
//        queue.forEach(System.out::println);
        queue.add("Dress");

        queue.stream().filter(s -> !s.endsWith("t")).forEach(System.out::println);
        System.out.println();
        queue.forEach(System.out::println);





    }
}
