package com.j2.factory;

public class PotatoPizza extends Pizza {
	public PotatoPizza() {
		name = "Potato Pizza";
		dough = "Regular Crust";
		sauce = "Tomato Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
