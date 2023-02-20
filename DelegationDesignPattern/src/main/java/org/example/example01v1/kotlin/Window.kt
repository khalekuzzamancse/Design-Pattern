package org.example.example01v1.kotlin

open class Window:WindowListener {
    override fun closeWindow() {
        println("Closing Window")
    }

    override fun openWindow() {
        println("Opening Window")
    }
}