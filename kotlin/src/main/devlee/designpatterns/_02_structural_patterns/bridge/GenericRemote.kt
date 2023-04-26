package main.devlee.designpatterns._02_structural_patterns.bridge

class GenericRemote(tvFactory: TVFactory) : RemoteControl(tvFactory) {

    fun nextChannel() {
        val channel = this.getChannel()
        this.setChannel(channel + 1)
    }

    fun prevChannel() {
        val channel = this.getChannel()
        this.setChannel(channel - 1)
    }
}