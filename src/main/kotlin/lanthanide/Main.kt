package lanthanide

import kotlinx.coroutines.runBlocking
import lanthanide.event.PlayerJoinEvent
import org.slf4j.LoggerFactory

fun main() = runBlocking {
    val logger = LoggerFactory.getLogger("main")
    logger.info("Booting Cyanogen.")
    Cyanogen.addEventListener<PlayerJoinEvent> {event -> DefaultEventHandlers.defaultPlayerJoinHandler(event)}

    // code for web
//    val serverSocket = ServerSocket(6567)
//
//    launch {
//        val socket = serverSocket.accept()
//        val input = socket.getInputStream()
//        val output = socket.getOutputStream()
//        println(input.readAllBytes().size)
//    }
    logger.info("Booted Cyanogen.")
}