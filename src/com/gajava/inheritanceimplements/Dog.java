package com.gajava.inheritanceimplements;

public class Dog implements Animal{
    @Override
    public void speak(){
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eats Bone");
    }
}
