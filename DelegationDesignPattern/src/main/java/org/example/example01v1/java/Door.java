package org.example.example01v1.java;

public class Door implements DoorActionListener {
    @Override
    public void closeDoor() {
        System.out.println("Door is closing");
    }

    @Override
    public void openDoor() {
        System.out.println("Door is opening");
    }
}
