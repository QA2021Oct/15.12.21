package com.company;

public class C implements NewInterface{

    public void turnOn(){
        System.out.println("turn on");
    }

    public void turnOff(){
        System.out.println("turn off");
    }

    public void broken() {
        System.out.println("broken");
    }

    @Override
    public boolean isWorking() {
        return false;
    }
}
