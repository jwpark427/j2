package com.j2.singleton.Chocolatethreadsafe;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueinstance;
  private static int numCalled=0;
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }
  public static synchronized ChocolateBoiler getinstance() {
    if(uniqueinstance==null) {
      System.out.println("Creating a new instance");
      uniqueinstance=new ChocolateBoiler();
    }
    //numCalled++;
    System.out.println("numCalled:"+numCalled++);
    return uniqueinstance;
  }

public void fill() {
  if(isEmpty()) {
    empty = false;
    boiled = false;
  }
}
public void drain() {
  if(!isEmpty() && isBoiled()) {
    empty = true;
  }
}
public void boil() {
  if(!isEmpty() && !isBoiled()) {
    boiled = true;
  }
}
public boolean isEmpty() {
  return empty;
}

public boolean isBoiled() {
  return boiled;
}
}