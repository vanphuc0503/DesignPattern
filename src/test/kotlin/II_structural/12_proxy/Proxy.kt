package II_structural.`12_proxy`

import org.junit.jupiter.api.Test

interface Image {
    fun display()
}

class RealImage(private val fileName: String) : Image {
    override fun display() {
        println("RealImage: Displaying $fileName")
    }

    private fun loadFromDisk(fileName: String) {
        println("RealImage: Loading $fileName")
    }

    init {
        loadFromDisk(fileName)
    }
}

class ProxyImage(private val fileName: String) : Image {
    private var realImage: RealImage? = null

    override fun display() {
        println("ProxyImage: Displaying $fileName")
        if (realImage == null) {
            realImage = RealImage(fileName)
        }
        realImage?.display()
    }
}

class ProxyTest {
    @Test
    fun testProxy() {
        val image = ProxyImage("test.jpg")

        //load image from disk
        image.display()
        println("---------------")

        //load image from "cache"
        image.display()
    }
}