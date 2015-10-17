package com.j2.method;

public class PizzaTestDrive { 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore smStore = new SMStylePizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		pizza = smStore.orderPizza("potato");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		
	}
}
