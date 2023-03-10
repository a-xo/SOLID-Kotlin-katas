package open_closed.exercise_2.bad

import java.util.*

class CheckingAccount(var balance: Double) {
    val accountId: UUID

    init {
        accountId = UUID.randomUUID()
    }

    fun deposit(amount: Double): Double {
        balance += amount
        return balance
    }

    fun withdraw(amount: Double): Double {
        val amountAfterFees = amount + WITHDRAW_FEE
        balance -= amountAfterFees
        return balance
    }

    fun applyInterest(numberOfMonths: Int): Double {
        return balance
    }

    fun transfer(amount: Double, toAccount: BasicAccount): Double {
        balance -= amount
        toAccount.deposit(amount)
        return balance
    }

    fun transfer(amount: Double, toAccount: CheckingAccount): Double {
        balance -= amount
        toAccount.deposit(amount)
        return balance
    }

    fun transfer(amount: Double, toAccount: MonthlyInterestAccount): Double {
        balance -= amount
        toAccount.deposit(amount)
        return balance
    }

    fun transfer(amount: Double, toAccount: YearlyInterestAccount): Double {
        balance -= amount
        toAccount.deposit(amount)
        return balance
    }

    companion object {
        private const val WITHDRAW_FEE = 0.15
    }
}