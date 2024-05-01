package lanthanide


import lanthanide.event.Event
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*
import java.util.function.Consumer
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.coroutines.suspendCoroutine

object Cyanogen {
    val logger: Logger = LoggerFactory.getLogger(Cyanogen::class.java)
    val eventHandlerMap: HashMap<Class<out Event>, ArrayList<Consumer<*>>> = HashMap()
    val onlinePlayerMap: HashMap<UUID, Player> = HashMap()

    inline fun <reified T: Event> addEventListener(eventHandler: Consumer<T>) {
        if (eventHandlerMap.containsKey(T::class.java)) {
            eventHandlerMap[T::class.java]?.add(eventHandler)
        } else {
            eventHandlerMap[T::class.java] = arrayListOf(eventHandler)
        }
        logger.info("Added Event Listener ${T::class.java.name}")
    }

    suspend fun <T: Event> fireEvent(event: T) {
        suspendCoroutine<Boolean> {
            for (eventHandler in eventHandlerMap[event::class.java]!!) {
                if (event.isCancelled) break
                (eventHandler as Consumer<in Event>).accept(event)
            }
        }
    }
}