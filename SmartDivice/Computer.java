package com.company;

public class Computer implements SmartDevice{

    private int screenSize;
    private String core;

    public Computer(int screenSize, String core){
        this.screenSize = screenSize;
        this.core = core;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public void setScreenSize(int newscreenSize){
            if(screenSize > 17 && newscreenSize < 49){
                this.screenSize = newscreenSize;
            }
    }

    public String getCore(){
        return  core;
    }

    public boolean isWorking(){
        if (screenSize > 17 && core == "i7"){
            return true;
        }
        return false;
    }

    public void turnOn(){
        System.out.println("Computer is turned on");
    }

    public void turnOff(){
        System.out.println("Computer is turned off");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "screenSize=" + screenSize +
                ", core='" + core + '\'' +
                '}';
    }
}
