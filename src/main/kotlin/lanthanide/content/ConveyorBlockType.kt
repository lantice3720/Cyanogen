package lanthanide.content

class ConveyorBlockType(override val hasPower: Boolean, override val conductivePower: Boolean) : BlockType {
    override val hasItem: Boolean = true
    override val hasLiquid: Boolean = false

    override fun onPlace() {

    }
}