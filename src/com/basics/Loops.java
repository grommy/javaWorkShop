package com.basics;

public class Loops {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("by index");
        for (int i = 0; i < arr.length; i+=2)
            System.out.println(arr[i]);

        System.out.println("break");  // out of cycle
        for (int arrElement: arr){
            if (arrElement % 3 == 0)
                break;
            System.out.println(arrElement);
        }

        System.out.println("continue"); // just continue
        for (int arrElement: arr){
            if (arrElement % 3 == 0)
                continue;
            System.out.println(arrElement);
        }


        System.out.println("return");  // out of method
        for (int arrElement: arr){
            if (arrElement % 3 == 0)
                return;
            System.out.println(arrElement);
        }

    }

}
