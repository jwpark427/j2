package com.j2.abspotato;

public class SMPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new SMPizzaIngredientFactory();
 
        if (item.equals("potato")) {
  
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("Sang Myung Style Potato Pizza");
  
        }
        if (item.equals("cheese")) {
        	  
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("Sang Myung Style Cheese Pizza");
  
        }
        return pizza;
    }
}
