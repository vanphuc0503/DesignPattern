package III_behavioural.`20_memento`

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

data class Memento(val state: String)

class Originator(var state: String) {
    fun createMemento() = Memento(state)

    fun restoreMemento(memento: Memento) {
        state = memento.state
    }
}

class CareTaker {
    private val mementoList = arrayListOf<Memento>()

    fun saveState(state: Memento) {
        mementoList.add(state)
    }

    fun restore(index: Int) : Memento = mementoList[index]
}

class MementoTest {
    @Test
    fun testMemento() {
        val originator = Originator("Initial state")
        val careTaker = CareTaker()
        careTaker.saveState(originator.createMemento())

        originator.state = "State 1"
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        originator.state = "State 2"
        careTaker.saveState(originator.createMemento())
        println("Current state is ${originator.state}")

        Assertions.assertThat(originator.state).isEqualTo("State 2")

        originator.restoreMemento(careTaker.restore(1))
        println("Current state is ${originator.state}")
        Assertions.assertThat(originator.state).isEqualTo("State 1")

        originator.restoreMemento(careTaker.restore(0))
        println("Current state is ${originator.state}")
        Assertions.assertThat(originator.state).isEqualTo("Initial state")

        originator.restoreMemento(careTaker.restore(2))
        println("Current state is ${originator.state}")
        Assertions.assertThat(originator.state).isEqualTo("State 2")
    }
}