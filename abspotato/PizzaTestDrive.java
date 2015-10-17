package com.j2.abspotato;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore smStore = new SMPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
 
        pizza = nyStore.orderPizza("potato");
        System.out.println("Joel ordered a " + pizza + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Park ordered a " + pizza + "\n");
        
        pizza = chicagoStore.orderPizza("potato");
        System.out.println("Jin ordered a " + pizza + "\n");
        
        pizza = smStore.orderPizza("cheese");
        System.out.println("Woo ordered a " + pizza + "\n");
        
        pizza = smStore.orderPizza("potato");
        System.out.println("Kim ordered a " + pizza + "\n");
	}
    	
    
}