package com.company;

public class IsraelBank implements Bank{

    private String bankName;
    public IsraelBank(String bankName){
        this.bankName = bankName;
    }

    public boolean canHaveBankAccount(Person person){
        if(person.getAge() < 21){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "IsraelBank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}
