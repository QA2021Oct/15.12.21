package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Bank poalim = new IsraelBank("Bank Poalim");
        Bank centralBank = new IndiaBank("Central Bank Of India");

        System.out.println("what is your name?");
        String name = s.nextLine();
        System.out.println("what is your age? ");
        int age = s.nextInt();

        Person newPerson = new Person(name, age);
        System.out.println("can have account in Israel? " +  poalim.canHaveBankAccount(newPerson) );
        System.out.println("can have account in India? " +  centralBank.canHaveBankAccount(newPerson) );
    }
}
