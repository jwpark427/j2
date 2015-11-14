package com.j2.adapter.smarthome; 

public class HomeTheaterFacade { 
     private Amplifier amp; 
     private Tuner tuner; 
     private DvdPlayer dvd; 
     private Projector projector; 
     private Computer com; 
     private Smartphone smp; 
   
     public HomeTheaterFacade 
       (Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, Computer com, Smartphone smp) { 
         this.amp = amp; 
         this.tuner = tuner; 
         this.dvd = dvd; 
         this.projector = projector; 

     } 
     public void watchMovie(String movie) { 
         System.out.println("\nGet ready to watch a movie..."); 
         projector.on(); 
         projector.wideScreenMode(); 
         amp.on(); 
         amp.setDvd(dvd); 
         amp.setVolume(5); 
         dvd.on(); 
         dvd.play(movie); 
     } 
     public void endMovie() { 
         System.out.println("\nShutting movie theater down..."); 
         projector.off(); 
         amp.off(); 
         dvd.stop(); 
         dvd.eject(); 
         dvd.off(); 
     } 
     public void listenToRadio(double frequency) { 
         System.out.println("\nTuning in the airwaves..."); 
         tuner.on(); 
         tuner.setFrequency(frequency); 
         amp.on(); 
         amp.setVolume(5); 
         amp.setTuner(tuner); 
     } 
     public void endRadio() { 
         System.out.println("\nshutting down the radio..."); 
         tuner.off(); 
         amp.off(); 
     } 
     public void beginStudy() { 
       System.out.println("\nGet ready to study............"); 
       System.out.println(""); 
     } 
     public void endStudy() { 
       System.out.println("\nFinish study............."); 
       System.out.println(""); 
     }
 } 