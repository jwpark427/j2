package com.j2.abspotato;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Potato createPotato() {
        return new MashedPotato();
    }
}

