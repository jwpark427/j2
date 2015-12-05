package com.j2.command.undo;

public class DoorCloseCommand implements Command {
  Door door;
  int level;
  public DoorCloseCommand(Door door) {
    this.door = door;
  }
  public void execute() {
    level = door.getLevel();
    door.close();
  }
  public void undo() {
    door.power(level);
  }
}