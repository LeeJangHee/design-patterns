package main.devlee.designpatterns._02_structural_patterns.bridge

class SpecialRemote(tvFactory: TVFactory) : RemoteControl(tvFactory) {

    fun up() {
        val channel = this.getChannel()
        this.setChannel(channel + 1)
    }

    fun down() {
        val channel = this.getChannel()
        this.setChannel(channel - 1)
    }
}