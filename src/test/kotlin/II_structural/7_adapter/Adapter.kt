package II_structural.`7_adapter`

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

data class DisplayDataType(val index: Float, val data: String)

class DataDisplay {
    fun displayData(dataType: DisplayDataType) {
        println("Data is displayed: ${dataType.index} - ${dataType.data}")
    }
}

// Our code

data class DatabaseData(val position: Int, val mount: Int)

class DatabaseGenerator {
    fun generateData(): List<DatabaseData> {
        val list = arrayListOf<DatabaseData>()
        list.add(DatabaseData(2, 2))
        list.add(DatabaseData(3, 7))
        list.add(DatabaseData(4, 23))
        return list
    }
}

interface DatabaseDataConverter {
    fun convertData(data: List<DatabaseData>): List<DisplayDataType>
}

class DataDisplayAdapter(val display: DataDisplay) : DatabaseDataConverter {
    override fun convertData(data: List<DatabaseData>): List<DisplayDataType> {
        val returnList = arrayListOf<DisplayDataType>()
        for (datum in data) {
            val ddt = DisplayDataType(datum.position.toFloat(), datum.mount.toString())
            display.displayData(ddt)
            returnList.add(ddt)
        }
        return returnList
    }
}

class AdapterTest {
    @Test
    fun adapterTest() {
        val generator = DatabaseGenerator()
        val generateData = generator.generateData()
        val adapter = DataDisplayAdapter(DataDisplay())
        val convertData = adapter.convertData(generateData)

        Assertions.assertThat(convertData.size).isEqualTo(3)
        Assertions.assertThat(convertData[1].index).isEqualTo(3f)
        Assertions.assertThat(convertData[1].data).isEqualTo("7")
    }
}