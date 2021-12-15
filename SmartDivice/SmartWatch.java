package com.company;

public class SmartWatch implements SmartDevice{
    private boolean nft;

    public SmartWatch(boolean NFT){
        this.nft = NFT;
    }

    public boolean isWorking(){
        if(nft){   /// nft == true  -> nft  (in case its boolean)
            return true;
        }
        else {
            return false;
        }
    }
    public void turnOn(){
        System.out.println("SmartWatch is turned on");
    }
    public void turnOff(){
        System.out.println("SmartWatch is turned off");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "nft=" + nft +
                '}';
    }
}
