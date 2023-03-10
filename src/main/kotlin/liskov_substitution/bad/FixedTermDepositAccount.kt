package liskov_substitution.bad

import java.math.BigDecimal

class FixedTermDepositAccount : Account() {
    override fun deposit(amount: BigDecimal) {
        // Deposit into this account
    }

    override fun withdraw(amount: BigDecimal) { //TODO: Breaks Liskov Substitution Principle!
        throw UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!")
    }
}