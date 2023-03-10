package open_closed.exercise_2.bad

import java.util.*

class TransferWithFeesAccount(var balance: Double) {
    val accountId: UUID

    init {
        accountId = UUID.randomUUID()
    }

    fun deposit(amount: Double): Double {
        balance += amount
        return balance
    }

    fun withdraw(amount: Double): Double {
        balance -= amount
        return balance
    }

    fun applyInterest(numberOfMonths: Int): Double {
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
        private const val TRANSFER_FEE = 5.0
    }
}