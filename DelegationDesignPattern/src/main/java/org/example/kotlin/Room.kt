package org.example.kotlin

import org.example.java.WindowActionListener


class Room: WindowActionListener, DoorActionListener {
    private val window= Window()
    private val door= Door()
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