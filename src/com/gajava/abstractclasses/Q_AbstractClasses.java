package com.gajava.abstractclasses;

abstract class Vehicle{
    public abstract void move();
    public void getdescription(){
        System.out.println("Vehicles are used for transportation");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void move(){
        System.out.println("Bicyle Move");
    }
}

class Plane extends Vehicle{
    @Override
    public void move(){
        System.out.println("Airplane Move");
    }
}

public class Q_AbstractClasses {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.move();
        plane1.getdescription();

        Bicycle bicycle1 = new Bicycle();
        bicycle1.move();
        bicycle1.getdescription();
    }
}
