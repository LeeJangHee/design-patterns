package main.devlee.designpatterns._02_structural_patterns.bridge

class Sony : DefaultTV("Sony") {
    private var channel: Int = 1
    override fun tuneChannel(channel: Int) {
        this.channel = channel
        println("Set the $type TV Channel to ${this.channel}")
    }

    override fun getChannel(): Int {
        return this.channel
    }
}