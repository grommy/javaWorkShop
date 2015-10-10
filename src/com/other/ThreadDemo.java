package com.other;

/**
 * Wait example
 */
public class ThreadDemo {
    public static void main (String[] args) throws InterruptedException {

        System.out.println("I'm first");

        Thread.sleep(2500);

        System.out.println("I'm next");

        Thread.sleep(2500);

        System.out.println("I'm final");
    }
}
