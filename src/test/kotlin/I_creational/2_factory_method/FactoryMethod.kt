package I_creational.`2_factory_method`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

sealed class Country {
    object Canada: Country()
    object Spain: Country()
    class Greece(val someProperty: String): Country()
    data class USA(val someProperty: String): Country()
}

class Currency (val code: String)

object CurrencyFactory {
    fun currencyForCountry(country: Country) : Currency =
        when(country) {
            is Country.Spain -> Currency("EUR")
            is Country.Greece -> Currency("EUR")
            is Country.USA -> Currency("USA")
            is Country.Canada -> Currency("CAD")
        }
}

class FactoryMethodTest {
    @Test
    fun currencyTest(){
        val geekCurrency = CurrencyFactory.currencyForCountry(Country.Greece("")).code
        println("geekCurrency: $geekCurrency")

        val usaCurrency = CurrencyFactory.currencyForCountry(Country.USA("")).code
        println("usaCurrency: $usaCurrency")

        Assertions.assertEquals(geekCurrency, "EUR")
        Assertions.assertEquals(usaCurrency, "USA")
    }
}