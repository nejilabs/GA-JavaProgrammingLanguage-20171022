package com.gajava.constructorswithinheritance;

public class ItalianChef extends Chef {

    public String countryOfOrigin;
    public ItalianChef(String name, int age, String countryOfOrigin){
        super(name,age);
        this.countryOfOrigin = countryOfOrigin;
    }
    @Override
    public void makeSpecialDish(){
        System.out.println("Make Italian Special Dish");
    }
}
