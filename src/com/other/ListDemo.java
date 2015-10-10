package com.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Collections
 */
public class ListDemo {

    public static void main(String[] args) {

        int a = 5;
        Integer aBig = a;
        System.out.println(aBig + 5.0);  //10.0

        List<String> names = new ArrayList<String>();
        names.add("Alex");
        names.add("Bob");
        names.add("Kate");
        names.add("James");
        names.add(1, "Roy");

        for (String name : names)
            System.out.println(name);

        names.remove(2);
        names.remove("James");

        System.out.println("\n After removing \n");
        for (String name : names)
            System.out.println(name);
    }
}
