package com.demo;

import java.util.*;

public class B {

    public static void main(String[] args) {

        LinkedList<String> test = new LinkedList<>();

        test.add("Amisha");
        test.add("astha");
        test.add("purva");
        test.add(1, "saloni");
        test.set(0, "ashu");

        System.out.println(test.getFirst());
        System.out.println(test.getLast());

        System.out.println(test);
    }
}
