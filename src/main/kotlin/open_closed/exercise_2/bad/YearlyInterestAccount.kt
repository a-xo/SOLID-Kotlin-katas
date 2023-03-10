package open_closed.exercise_2.bad

import java.util.*

class YearlyInterestAccount(var balance: Double) {
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

    fun applyInterest(numberOfYears: Int): Double {
        val compoundInterest =
            Math.pow(1 + YEARLY_INTEREST, numberOfYears.toDouble())
        balance = balance * compoundInterest
        return balance
    }

    fun transfer(amount: Double, toAccount: BasicAccount): Double {
        val amountAfterFees = amount + TRANSFER_FEE
        balance -= amountAfterFees
        toAccount.deposit(amount)
        return balance
    }

    fun transfer(amount: Double, toAccount: CheckingAccount): Double {
        val amountAfterFees = amount + TRANSFER_FEE
        balance -= amountAfterFees
        toAccount.deposit(amount)
        return balance
    }

    fun transfer(amount: Double, toAccount: MonthlyInterestAccount): Double {
        val amountAfterFees = amount + TRANSFER_FEE
        balance -= amountAfterFees
        toAccount.deposit(amount)
        return balance
    }

    fun transfer(amount: Double, toAccount: YearlyInterestAccount): Double {
        val amountAfterFees = amount + TRANSFER_FEE
        balance -= amountAfterFees
        toAccount.deposit(amount)
        return balance
    }

    companion object {
        private const val YEARLY_INTEREST = 0.05
        private const val WITHDRAW_FEE = 1.5
        private const val TRANSFER_FEE = 2.5
    }
}