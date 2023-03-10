package single_responsibility.exercise_1.bad

internal class Product(
    private val name: String,
    private val price: Double,
    taxRateSpain: Double,
    taxRateUK: Double
) {
    private val VAT_GERMANY = 0.19
    private val VAT_SPAIN = 0.21
    private val VAT_UK = 0.2
    fun calculatePriceWithTax(country: Country): Double {
        return when (country) {
            Country.GERMANY -> price * VAT_GERMANY
            Country.SPAIN -> price * VAT_SPAIN
            Country.UK -> price * VAT_UK
        }
    }

    fun calculateTotalPriceWithTaxForOrder(
        quantity: Int,
        country: Country
    ): Double {
        return quantity * calculatePriceWithTax(country)
    }

    enum class Country {
        GERMANY, SPAIN, UK
    }
}