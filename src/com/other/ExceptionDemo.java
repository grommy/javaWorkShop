package com.other;

/**
 * Created by nkondratiev on 10.10.15.
 */
public class ExceptionDemo {

    public int div(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {

        System.out.println("Starting");
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.div(4, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executed anyway");
        }


    }
}
