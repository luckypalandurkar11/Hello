    package com.demo;

    import java.util.HashSet;
    import java.util.Set;
    import java.util.TreeSet;

    public class D {

        public static void main(String[] args) {

            Set<Integer> set = new HashSet<>();
            set.add(12);
            set.add(13);
            set.add(4);

            Set<Integer> tree = new HashSet<>();
            tree.add(15);
            tree.add(4);

            set.removeAll(tree);
            System.out.println(set);

        }
    }
