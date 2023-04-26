package main.devlee.designpatterns._02_structural_patterns.bridge

class BridgeClient {
    init {
        val tvFactory = TVFactory()
        val remoteSony = SpecialRemote(tvFactory)
        println("Connect your remote to the TV.")
        remoteSony.setTV("Sony")
        remoteSony.on()
        remoteSony.up()
        remoteSony.up()
        remoteSony.down()
        remoteSony.off()
        println("==============================")

        val remoteLG = GenericRemote(tvFactory)
        println("Connect your remote to the TV.")
        remoteLG.setTV("LG")
        remoteLG.on()
        remoteLG.setChannel(30)
        remoteLG.nextChannel()
        remoteLG.prevChannel()
        remoteLG.prevChannel()
        remoteLG.off()
        println("==============================")

        val remoteSamsung = GenericRemote(tvFactory)
        println("Connect your remote to the TV.")
        remoteSamsung.setTV("Samsung")
        remoteSamsung.setChannel(99)
        remoteSamsung.nextChannel()
        remoteSamsung.nextChannel()
        remoteSamsung.nextChannel()
        remoteSamsung.off()

    }
}

private fun main() {
    BridgeClient()
}