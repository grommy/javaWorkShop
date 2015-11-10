package com.oop;

/**
 * Implement statement
 */
public class Nexus5 implements Smartphone{

    public static void main(String[] args) {
        Smartphone nexus = new Nexus5();
        nexus.call();
        System.out.println(nexus.SCREEN_SIZE);
        nexus.takePhoto();
        nexus.installApp("Angry Birds");
    }

    @Override
    public void call() {
        System.out.println("Nexus makes call");
    }

    @Override
    public void takePhoto() {
        System.out.println("Nexus takes photo");
    }

    @Override
    public void installApp(String name) {
        System.out.printf("Nexus installs %s \n ", name);
    }
}
