package lanthanide.event

interface Event {
    var isCancelled: Boolean

    /**
     * Cancels the event and stop processing it.
     * 
     * **Warning: handlers with higher priority than the one calling this method will not be cancelled.**
     */
    fun cancel() {
        isCancelled = true
    }
}