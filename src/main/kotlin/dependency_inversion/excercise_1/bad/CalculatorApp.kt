package dependency_inversion.excercise_1.bad

object CalculatorApp {
    @JvmStatic
    fun main(args: Array<String>) {
        BasicCalculator.calculate()
    }
}