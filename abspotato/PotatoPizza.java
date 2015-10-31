package com.j2.abspotato;

public class PotatoPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public PotatoPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        potato = ingredientFactory.createPotato();
        cheese = ingredientFactory.createCheese();
    }
}
