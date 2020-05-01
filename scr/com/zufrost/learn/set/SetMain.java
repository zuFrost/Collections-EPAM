package com.zufrost.learn.set;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        boolean value = set.add("ten");
        System.out.println(set + " " + value);
        value = set.add("ten");
        System.out.println(set + " " + value);
        value = set.add(new String("ten"));
        System.out.println(set + " " + value);

        Set<String> setAnonimClass = new HashSet<String>() {
            {
                this.add("one");
                this.add("two");
                this.add("ten");
            }
        };
        System.out.println(setAnonimClass);
    }
}
