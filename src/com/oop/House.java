package com.oop;

public class House {
    private int bedRooms;
    protected String address = "Wall-street";
    String[] neighbourhood = {};

    House() {
        System.out.println("==House creation==");
    }

    House(int bedRooms, String address) {
        this.bedRooms = bedRooms;
        this.address = address;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    void getInfo() {
        System.out.println("Info: \n Rooms: "+bedRooms
                           + "\n address: "+address);
    }

    boolean isBigger(int roomNumber) {
        if (bedRooms > roomNumber)
            return true;
        else return false;

    }

}
