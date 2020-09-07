package com.gajava.inheritanceimplements;

public class Bird implements Animal {
    @Override
    public void speak(){
        System.out.println("Tweet Tweet");
    }

    @Override
    public void eat(){
        System.out.println("Eat Grass");
    }
}
