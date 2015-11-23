package com.examples.barry.trickyReference;

/**
 * Created by admin on 11/15/15.
 */
public class ArrayLocation {
    private double coords[];

    public ArrayLocation(double[] coords) {
        this.coords = coords;
    }

    public static void main(String[] args) {
        double[] coords = {5.0, 0.0};
        double[] coords1 = {3.0, 3.0};
        ArrayLocation accra = new ArrayLocation(coords);
        ArrayLocation beta = new ArrayLocation(coords1);


        coords[0] = 32.9;

        accra = beta;

        System.out.println(accra.coords[0]);
    }
}
