package com.j2.adapter.smarthome; 

public class Amplifier { 
   private String description; 
   private Tuner tuner; 
   private DvdPlayer dvd; 
    
   public Amplifier(String description) { 
     this.description = description; 
   } 
   public void on() { 
     System.out.println(description+" on"); 
   } 
   public void off() { 
     System.out.println(description+" off"); 
   } 
   public void setDvd(DvdPlayer dvd) { 
     System.out.println(description+" setting "+dvd); 
     this.dvd = dvd; 
   } 
   public void setTuner(Tuner tuner) { 
     System.out.println(description+" setting tuner "+dvd); 
     this.tuner = tuner; 
   } 
   public void setVolume(int level) { 
     System.out.println(description+" setting voiume "+level); 
     this.tuner = tuner; 
   } 
   public String toString(){ 
     return description; 
   } 
 } 