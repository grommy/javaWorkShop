package com.oop;

/**
 * Created by nkondratiev on 10.10.15.
 */
public class HouseDemo {
    public static void main(String[] args){
        House house1 = new House();
        House house2 = new House(3,"Malevicha-str");

        house1.address = "Baker str. 221";

        house1.getInfo();
        house2.getInfo();

        System.out.println(house1.getBedRooms());

        if (house1.getBedRooms() > house2.getBedRooms())
            System.out.println("House 1 is bigger");

        System.out.println(house2.isBigger(5));
    }
}
