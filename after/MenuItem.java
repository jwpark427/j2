package com.j2.iterator.dinermerger.after;
public class MenuItem {
    String name;
    String description;
    boolean vegetarian; 
    double price;
 
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
 public boolean isVegetarian() {
  // TODO Auto-generated method stub
  return vegetarian;
 }
}
