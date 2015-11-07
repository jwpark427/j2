package com.j2.command.macro;
 
public class RemoteLoader {

 public static void main(String[] args) {

  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

  Light light = new Light("Living Room");
  DVD dvd = new DVD("DVD Player");
 
  LightOnCommand lightOn = new LightOnCommand(light);
  DVDOnCommand dvdOn = new DVDOnCommand(dvd);
  LightOffCommand lightOff = new LightOffCommand(light);
  DVDOffCommand dvdOff = new DVDOffCommand(dvd);

  Command[] partyOn = { lightOn, dvdOn};
  Command[] partyOff = { lightOff, dvdOff};
  
  MacroCommand partyOnMacro = new MacroCommand(partyOn);
  MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
  remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
  System.out.println("--- Pressing Macro On---");
  remoteControl.onButtonWasPressed(0);
  System.out.println("--- Pressing Macro Off---");
  remoteControl.offButtonWasPressed(0);
 }
}
