package com.j2.adapter.smarthome; 

public class Smartphone { 
   String description; 
    
   public Smartphone(String description) { 
     this.description = description; 
   } 
   public void on() { 
     System.out.println(description+" on "); 
   } 
   public void off() { 
     System.out.println(description+" off "); 
   } 
 } 