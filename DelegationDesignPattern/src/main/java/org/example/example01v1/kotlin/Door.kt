package org.example.example01v1.kotlin

import org.example.example01v1.java.DoorActionListener

open class Door : org.example.example01v1.kotlin.DoorActionListener {
    override fun closeDoor() {
        println("Door is closing")
    }

    override fun openDoor() {
        println("Door is opening")
    }
}