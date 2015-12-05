package com.j2.command.undo; 
 
public class RemoteLoader { 
   public static void main(String[] agrs) { 
     RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(); 
       
      Light livingRoomLight = new Light("Living Room"); 
   
      LightOnCommand livingRoomLightOn = 
        new LightOnCommand(livingRoomLight); 
      LightOffCommand livingRoomLightOff = 
        new LightOffCommand(livingRoomLight); 
   
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff); 
      remoteControl.offButtonWasPressed(0);   
      remoteControl.onButtonWasPressed(0); 
      
      remoteControl.undoButtonWasPressed(); 
      remoteControl.offButtonWasPressed(0); 
      remoteControl.onButtonWasPressed(0); 
       
      remoteControl.undoButtonWasPressed(); 
      
      
     DVD dvd  = new DVD("DVD Player"); 
      
     DVDOnCommand DVDOn 
       = new DVDOnCommand(dvd); 
     DVDOffCommand DVDOff 
       = new DVDOffCommand(dvd); 
      
     remoteControl.setCommand(0, DVDOn, DVDOff); 
    
     remoteControl.offButtonWasPressed(0); 
     remoteControl.onButtonWasPressed(0); 
     
     remoteControl.undoButtonWasPressed(); 
     remoteControl.offButtonWasPressed(0); 
     remoteControl.onButtonWasPressed(0); 
     remoteControl.undoButtonWasPressed(); 
   
  
     Door door = new Door("Garage Door"); 
      
     DoorOpenCommand dooropen 
      = new DoorOpenCommand(door); 
     DoorCloseCommand doorclose 
       =new DoorCloseCommand(door); 
      
     remoteControl.setCommand(0, dooropen, doorclose); 
     
     remoteControl.offButtonWasPressed(0);
     remoteControl.onButtonWasPressed(0); 
     remoteControl.undoButtonWasPressed(); 
     remoteControl.offButtonWasPressed(0); 
     remoteControl.onButtonWasPressed(0); 
     remoteControl.undoButtonWasPressed(); 
   } 
 } 
