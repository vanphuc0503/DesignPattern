package I_creational.`1_singleton`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

object NetworkDriver {
    init {
        println("Init: $this")
    }

    fun log(): NetworkDriver = apply { println("Network driver: $this") }
}

class SingletonTest {
    @Test
    fun testSingleton() {
        println("Start")
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()

        Assertions.assertEquals(networkDriver1, NetworkDriver)
        Assertions.assertEquals(networkDriver2, NetworkDriver)
    }
}