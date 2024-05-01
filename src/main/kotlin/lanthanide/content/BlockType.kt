package lanthanide.content

/**
 * BlockType which is immutable.
 * You must create another instance if you want to change its value.
 *
 * Not designed to store placed block data.
 * If you are looking for an object that stores block data, goto [PlacedBlock].
 */
interface BlockType {
    // Currently just copy-pasted variables from mindustry.world.Block
    // Planned to optimize
    val hasItem get() = false
    val hasLiquid get() = false
    val hasPower get() = false
    val outputLiquid get() = false
    val consumePower get() = true // Why is it true by default?
    val outputPower get() = false
    val conductivePower get() = false
    val outputPayload get() = false
    val acceptPayload get() = false
    val acceptPayloads get() = false // What's the difference with [acceptPayload]?
    val itemCapacity get() = 10
    val liquidCapacity get() = 10f
    val liquidPressure get() = 1f // Mindustry might change it.
    val outputFacing get() = true
    val noSideBlend get() = false
    val displayFlow get() = true // Should server calculate flow and send to client? If false, removable
    val inEditor get() = true // No editor here. removable
    val lastConfig: Any? get() = null // last config value? Do server need it?
    val saveConfig get() = false // As I know, it's used in placing blocks. Maybe removable with [lastConfig]
    val copyConfig get() = true // Same to [saveConfig]
    val clearOnDoubleTap get() = false // Maybe same with [saveConfig]. Should server handle double tap?
    val updateNeeded get() = false
    val destructible get() = true
    val unloadable get() = true
    val isDuct get() = false // Maybe just hard-coding a list of ducts in armored duct would be better.
    val allowResupply get() = false // Similar to [isDuct]
    val solid get() = true
    val solidifies get() = false // Hardcoding blocks able to solidify? But I want to make [solid] a const. TODO ponder it when working with [PlacedBlock]
    val teamPassable get() = false
    val underBullets get() = false
    val rotatable get() = false
    val rotateDraw get() = false // Removable
    val lockRotation get() = true // What's this?
    val invertFlip get() = false // Related to schematics. removable
    val variants get() = 0 // What's this?
    val drawArrow get() = true // Removable
    val drawTeamOverlay get() = true // Removable
    val saveData get() = false // What is static blocks...?


    abstract fun onPlace()
}