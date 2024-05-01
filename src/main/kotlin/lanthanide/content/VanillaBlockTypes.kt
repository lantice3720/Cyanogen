package lanthanide.content

enum class VanillaBlockTypes : BlockType {
    CONVEYOR {
        override val hasItem = true

        override fun onPlace() {
            TODO("Not yet implemented")
        }
    },
    TITANIUM_CONVEYOR {
        override val hasItem = true

        override fun onPlace() {
            TODO("Not yet implemented")
        }
    },
    ARMORED_CONVEYOR {
        override val hasItem = true
        override val noSideBlend = true

        override fun onPlace() {
            TODO("Not yet implemented")
        }
    },
    PLASTANIUM_CONVEYOR {
        override val hasItem = true

        override fun onPlace() {
            TODO("Not yet implemented")
        }
    },
}