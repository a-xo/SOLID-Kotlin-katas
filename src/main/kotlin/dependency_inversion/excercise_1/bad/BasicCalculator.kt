package dependency_inversion.excercise_1.bad

import java.util.*

object BasicCalculator {
    fun calculate() {
        println("Enter basic operation separated by spaces:")
        println("e.g. 4 + 1")
        println("e.g. 58 - 3")
        println("e.g. 19 * 7")
        println("e.g. 20 / 4")
        println("e.g. 10 % 9")
        val scanner = Scanner(System.`in`)
        val line = scanner.nextLine()
        val lineSplit = line.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray()
        val firstNumber = lineSplit[0].toInt()
        val operation = lineSplit[1]
        val secondNumber = lineSplit[2].toInt()
        val result: String = when (operation) {
            "+" -> (firstNumber + secondNumber).toString()
            "-" -> (firstNumber - secondNumber).toString()
            "*" -> (firstNumber * secondNumber).toString()
            "/" -> (firstNumber / secondNumber).toString()
            "%" -> (firstNumber % secondNumber).toString()
            else -> "Operation not recognised"
        }
        println(result)
    }
}