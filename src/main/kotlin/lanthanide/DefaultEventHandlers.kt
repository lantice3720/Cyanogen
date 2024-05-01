package lanthanide

import lanthanide.event.PlayerJoinEvent

object DefaultEventHandlers {
    fun defaultPlayerJoinHandler(event: PlayerJoinEvent) {
        println("New PlayerJoinHandler")
    }
}
