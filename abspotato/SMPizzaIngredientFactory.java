package com.j2.abspotato;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Potato createPotato() {
        return new MashedPotato();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
