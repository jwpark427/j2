package com.j2.command.macro;

public class DVD {
 String location;
 int level;
 public DVD(String location) {
  this.location = location;
 }
 public int getLevel() {
  return level;
 }
 public void on() {
  level = 100;
  System.out.println("DVD is on");
 }
 public void off() {
  level = 0;
  System.out.println("DVD is off");
 }
 public void power(int level) {
  this.level = level;
  if (level == 0) {
   off();
  }
  else {
   System.out.println("DVD is power " + level);
  }
 }
}