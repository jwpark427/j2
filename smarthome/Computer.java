package com.j2.adapter.smarthome; 

public class Computer { 
     String description; 
   
     public Computer(String description) { 
         this.description = description; 
     } 
     public void on() { 
         System.out.println(description + " on"); 
     } 
     public void off() { 
         System.out.println(description + " off"); 
     } 
 } 