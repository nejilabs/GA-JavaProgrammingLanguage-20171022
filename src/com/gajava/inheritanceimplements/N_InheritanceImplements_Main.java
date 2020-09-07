package com.gajava.inheritanceimplements;

public class N_InheritanceImplements_Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Bird(),
                new Dog()
        };

         for (int i=0; i<animals.length;i++){
             animals[i].speak();
             animals[i].eat();
         }

    }
}
