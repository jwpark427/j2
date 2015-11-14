package com.j2.adapter.smarthome; 
 
 
 public class HomeTheaterTestDrive { 
   public static void main(String[] agrs) { 
     Amplifier amp = new Amplifier("My Amplifier"); 
     Tuner tuner =  new Tuner("My AM/FM Tuner", amp); 
     DvdPlayer dvd = new DvdPlayer("My DVD Player", amp); 
     Projector projector = new Projector("My Projector", dvd); 
     Computer com = new Computer("My Computer"); 
     Smartphone smp = new Smartphone("My Smartphone"); 
      
     HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, com, smp); 
     System.out.println("********************************************"); 
     homeTheater.watchMovie("My Movie Watching..."); 
     homeTheater.endMovie(); 
     System.out.println("********************************************");
     homeTheater.listenToRadio(5); 
     homeTheater.endRadio(); 
     System.out.println("********************************************"); 
     homeTheater.beginStudy(); 
     homeTheater.endStudy(); 
   } 
 } 