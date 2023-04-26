package main.devlee.designpatterns._02_structural_patterns.bridge

interface TV {
    fun on()
    fun off()
    fun tuneChannel(channel: Int)
    fun getChannel(): Int
}