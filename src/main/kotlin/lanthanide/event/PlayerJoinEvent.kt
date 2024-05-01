package lanthanide.event

import lanthanide.Player

class PlayerJoinEvent(val playerIP: String, val player: Player): Event {
    override var isCancelled: Boolean = false
}