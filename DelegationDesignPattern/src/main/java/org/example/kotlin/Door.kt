package org.example.kotlin

open class Door : org.example.kotlin.DoorActionListener {
    override fun closeDoor() {
        println("Door is closing")
    }

    override fun openDoor() {
        println("Door is opening")
    }
}