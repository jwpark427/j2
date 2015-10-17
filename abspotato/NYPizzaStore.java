package com.j2.abspotato;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
 
        if (item.equals("cheese")) {
  
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
  
        }
        if (item.equals("potato")) {
        	  
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Potato Pizza");
  
        }
        return pizza;
    }
}