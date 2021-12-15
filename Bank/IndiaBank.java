package com.company;

public class IndiaBank implements Bank{

    private String bankName;

    public IndiaBank(String bankName){
        this.bankName = bankName;
    }
    public boolean canHaveBankAccount(Person person){
        if (person.getAge() < 18){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "IndiaBank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}
