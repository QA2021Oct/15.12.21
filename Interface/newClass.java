package com.company;

public class newClass implements NewInterface {

    @Override
    public void turnOn() {
        System.out.println("turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off");
    }

    @Override
    public void broken() {
        System.out.println("uff - broken):");
    }
}
