package com.j2.method;

public class SMStylePizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		if (item.equals("potato")) {
			return new SMStylePotatoPizza();
		}  else return null;
	}
}