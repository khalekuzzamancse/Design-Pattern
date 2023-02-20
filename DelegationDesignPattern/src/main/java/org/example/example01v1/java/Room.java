package org.example.example01v1.java;

public class Room {
    private final WindowActionListener window=new Window();
    private final DoorActionListener door=new Door();
    public void closeDoor(){
        door.closeDoor();
    }
    public void openDoor(){
        door.openDoor();
    }
    public void closeWindow(){
      window.closeWindow();
    }
    public void openWindow(){
        window.openWindow();
    }

}
