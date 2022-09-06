package I_creational.`3_abstract_factory`

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

interface DataSource

class DatabaseDataSource : DataSource

class NetworkDataSource : DataSource

abstract class DataSourceFactory {
    abstract fun makeDataSource(): DataSource

    companion object {
        inline fun <reified T : DataSource> createFactory(): DataSourceFactory =
            when (T::class) {
                DatabaseDataSource::class -> DatabaseFactory()
                NetworkDataSource::class -> NetworkFactory()
                else -> throw IllegalArgumentException()
            }
    }
}

class NetworkFactory : DataSourceFactory() {
    override fun makeDataSource(): DataSource = NetworkDataSource()
}

class DatabaseFactory : DataSourceFactory() {
    override fun makeDataSource(): DataSource = DatabaseDataSource()
}

class AbstractFactoryTest {
    @Test
    fun aftest() {
        val dataSourceFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val dataSource = dataSourceFactory.makeDataSource()
        println("Created datasource $dataSource")

        Assertions.assertThat(dataSource).isInstanceOf(DatabaseDataSource::class.java)
    }
}