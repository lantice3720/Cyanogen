package lanthanide

import java.util.*

class Player(val name: String ,val uuid: UUID) {
    constructor(name: String) : this(name,UUID.randomUUID())
}