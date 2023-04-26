package main.devlee.designpatterns._02_structural_patterns.bridge

import java.lang.Exception

abstract class RemoteControl(private val tvFactory: TVFactory) {
    private lateinit var tv: TV

    fun on() {
        this.tv.on()
    }

    fun off() {
        this.tv.off()
    }

    fun setChannel(channel: Int) {
        tv.tuneChannel(channel)
    }

    fun getChannel(): Int {
        return this.tv.getChannel()
    }

    fun setTV(type: String) {
        try {
            tv = tvFactory.getTV(type)
        } catch (e: Exception) {
            println(e)
        }
    }
}