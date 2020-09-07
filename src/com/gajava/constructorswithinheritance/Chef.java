package com.gajava.constructorswithinheritance;

public class Chef {

    public String name;
    public int age;

    public Chef(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeChicken(){
        System.out.println("Make Chicken");
    }
    public void makeSalad(){
        System.out.println("Make Salad");
    }
    public void makeSpecialDish(){
        System.out.println("Make Special Dish");
    }
}
