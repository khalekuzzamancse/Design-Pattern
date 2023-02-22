package org.example.java;

public class Room implements WindowActionListener,DoorActionListener{
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
