package com.j2.templatemethod.barista;

import java.io.*;

public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook {
 
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
 public void addCondiments2() {
  System.out.println("Adding Caramel Syrup");
 }
 
 public boolean customerWantsCondiments() {

  String answer = getUserInput();

  if (answer.toLowerCase().startsWith("y")) {
   return true;
  } else {
   return false;
  }
 }
 
 private String getUserInput() {
  String answer = null;

  System.out.print("Would you like Whip with your coffee (y/n)? ");

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  try {
   answer = in.readLine();
  } catch (IOException ioe) {
   System.err.println("IO error trying to read your answer");
  }
  if (answer == null) {
   return "no";
  }
  return answer;
 }
}
