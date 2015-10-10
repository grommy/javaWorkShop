package com.oop;

/**
 * Created by nkondratiev on 10.10.15.
 */
public class Villa extends House {

    /**
     * Class Villa extends House
     */

    Villa() {
        System.out.println("==Villa creation==");
    }

    boolean swimmingPool = true;

    @Override
    void getInfo() {
        System.out.println("Address: " + this.address);
        System.out.println("rooms: " + this.getBedRooms());
        System.out.println("pool: " + this.swimmingPool);

    }

    void getInfo(boolean shortVersion) {
        if (shortVersion)
            System.out.println("SwimmingPool: " + this.swimmingPool);
        else
            getInfo();
    }

}
