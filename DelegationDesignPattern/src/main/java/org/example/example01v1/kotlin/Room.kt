package org.example.example01v1.kotlin

import org.example.example01v1.java.WindowActionListener

//class Room:WindowListener by Window(),DoorActionListener by Door()
class Room:WindowActionListener,DoorActionListener {
    private val window=Window()
    private val door=Door()
    override fun openWindow() {
       window.openWindow()
    }

    override fun closeWindow() {
      window.closeWindow()
    }

    override fun openDoor() {
        door.openDoor()
    }

    override fun closeDoor() {
        door.closeDoor()
    }

}