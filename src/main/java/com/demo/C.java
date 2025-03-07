package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("India");
        set.add("Russia");
        set.add("Italy");
        set.add("China");
        set.add("USA");
        set.add("Italy");

        System.out.println(set);
        System.out.println(set.size());

        boolean result = set.contains("India");
        System.out.println(result);

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
