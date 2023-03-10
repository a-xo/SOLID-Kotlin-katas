package liskov_substitution.bad

import java.math.BigDecimal

class SavingsAccount : Account() {
    override fun deposit(amount: BigDecimal) {
        // Deposit into SavingsAccount
    }

    override fun withdraw(amount: BigDecimal) {
        // Withdraw from SavingsAccount
    }
}