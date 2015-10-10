package com.other;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nkondratiev on 10.10.15.
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Alex");
        names.add("Bob");
        names.add("Kate");
        names.add("James");
        names.add("Alex");

        for (String name : names)
            System.out.println(name);
    }
}
