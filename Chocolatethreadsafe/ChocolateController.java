package com.j2.singleton.Chocolatethreadsafe;

public class ChocolateController {
  public static void main(String args[]) {
    ChocolateBoiler boiler = ChocolateBoiler.getinstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
    
    ChocolateBoiler boiler2 = ChocolateBoiler.getinstance();
    boiler2.fill();
  }
}