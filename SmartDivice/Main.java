package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Smartphone ipone13 = new Smartphone(4);
        Smartphone galaxy10 = new Smartphone(3);
        Computer dellComputer = new Computer(29, "i7");
        SmartWatch SumsongWatch4 = new SmartWatch(true);

        System.out.println(ipone13);
        ipone13.turnOn();
        ipone13.turnOff();
        System.out.println("is working? " +ipone13.isWorking());
        ipone13.getCoordinate();

        System.out.println(dellComputer);
        dellComputer.turnOn();
        dellComputer.turnOff();
        System.out.println("is working? " + dellComputer.isWorking());

        // working with getter and setter:
        System.out.println(dellComputer.getScreenSize());
        dellComputer.setScreenSize(19);
        System.out.println(dellComputer.getScreenSize());


    }
}
