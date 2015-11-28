package com.j2.singleton.PrintSpooler;  
 
public class PrintSpooler { 
  private static PrintSpooler uniqueinstance;
  private static int numCalled = 0; 
  private PrintSpooler() {
  } 
  public static synchronized PrintSpooler getInstance() { 
     if(uniqueinstance ==null) { 
       uniqueinstance = new PrintSpooler(); 
       System.out.println("Using the Printspooler fail"); 
     } 
    
     else{ 
       System.out.println("Using the Printspooler success "); 
     } 
     System.out.println("Using the Printspooler: "+numCalled++); 
     return uniqueinstance; 
   } 
 } 
