package com.company;

public class Smartphone implements SmartDevice, GPS{
    private  int numbersOfCameras;

    public Smartphone(int numbersOfCameras){
        this.numbersOfCameras = numbersOfCameras;
    }

    public boolean isWorking(){
        if(numbersOfCameras > 1 ){
            return true;
        }
        else if( numbersOfCameras > 5)
        {
            return false;
        }
        else return true;
    }

    public void turnOn(){
        System.out.println("Smartphone turned On");
    }

    public void turnOff(){
        System.out.println("Smartphone turned OFF");
    }

    public void getCoordinate(){
        System.out.println("Coordinate: 3.4153- 5.1546");
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "numbersOfCameras=" + numbersOfCameras +
                '}';
    }
}
