package com.j2.command.undo;

public class DoorOpenCommand implements Command {
  Door door;
  int level;
  public DoorOpenCommand(Door door) {
    this.door = door;
  }
  public void execute() {
    level = door.getLevel();
    door.open();
  }
  public void undo() {
    door.power(level);
  }
}