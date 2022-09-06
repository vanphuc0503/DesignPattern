package III_behavioural.`13_observer`

import org.junit.jupiter.api.Test
import java.io.File

interface EventListener {
    fun update(eventType: String?, file: File?)
}

class EventManager(vararg operations: String) {
    var listeners = hashMapOf<String, ArrayList<EventListener>>()

    init {
        operations.forEach {
            listeners[it] = ArrayList()
        }
    }

    fun subscribe(eventType: String?, listener: EventListener) {
        val users = listeners[eventType]
        users?.add(listener)
    }

    fun unsubscribe(eventType: String?, listener: EventListener) {
        val users = listeners[eventType]
        users?.remove(listener)
    }

    fun notify(eventType: String?, file: File?) {
        val users = listeners[eventType]
        users?.forEach {
            it.update(eventType, file)
        }
    }
}

class Editor {
    val events = EventManager("open", "save")

    private var file: File? = null

    fun openFile(filePath: String) {
        file = File(filePath)
        events.notify("open", file)
    }

    fun saveFile() {
        file?.let {
            events.notify("save", it)
        }
    }
}

class EmailNotificationListener(private val email: String) : EventListener {
    override fun update(eventType: String?, file: File?) {
        println("Email to $email: Someone has performed $eventType operation with the file ${file?.name}")
    }
}

class LogOpenListener(private var fileName: String) : EventListener {
    override fun update(eventType: String?, file: File?) {
        println("Save to log $fileName: Someone has performed $eventType operation with the file ${file?.name}")
    }
}

class ObserverTest {
    @Test
    fun testObserver() {
        val editor = Editor()

        val logListener = LogOpenListener("path/to/log")
        val emailListener = EmailNotificationListener("test@test.com")

        editor.events.apply {
            subscribe("open", logListener)
            subscribe("open", emailListener)
            subscribe("save", emailListener)

            editor.openFile("test.txt")
            editor.saveFile()

            println("------------- part 2")
            unsubscribe("open", emailListener)
            editor.openFile("test.txt")
        }
    }
}