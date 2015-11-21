package com.j2.templatemethod.barista;

public class CaramelMacchiato  extends CaffeineBeverage {
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 public void addCondiments() {
  System.out.println("Adding Vanila Syrup");
  System.out.println("Adding Espresso");
  System.out.println("Adding boiled Milk");
  System.out.println("Adding Caramel Syrup");
  System.out.println("Adding Whip");
 }
}
