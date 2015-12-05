package com.j2.singleton.PrintSpooler;

public class PrintController {
  public static void main(String args[]) {
   
    System.out.println("use the printspooler");
    PrintSpooler spooler = PrintSpooler.getInstance();
     
    System.out.println("use the printspooler2");
    PrintSpooler spooler2 = PrintSpooler.getInstance();
  }
}