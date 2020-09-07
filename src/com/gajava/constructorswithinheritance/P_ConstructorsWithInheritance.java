package com.gajava.constructorswithinheritance;

public class P_ConstructorsWithInheritance {
    public static void main(String[] args) {
        Chef normalChef = new Chef("Normal Chef", 50);
        normalChef.makeChicken();
        normalChef.makeSpecialDish();

        ItalianChef italianChef = new ItalianChef("Italian Chef", 20, "italy");
        italianChef.makeChicken();
        italianChef.makeSpecialDish();
    }
}
