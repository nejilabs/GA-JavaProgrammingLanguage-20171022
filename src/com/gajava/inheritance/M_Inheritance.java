package com.gajava.inheritance;

public class M_Inheritance {
    public static void main(String[] args) {
        Chef normalChef = new Chef();
        normalChef.makeChicken();
        normalChef.makeSalad();
        normalChef.makeSpecialDish();

        Chef italianChef = new ItalianChef();
        italianChef.makeChicken();
        italianChef.makeSalad();
        italianChef.makeSpecialDish();
    }

}
