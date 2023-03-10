package liskov_substitution.bad

import java.math.BigDecimal

class CurrentAccount : Account() {
    override fun deposit(amount: BigDecimal) {
        // Deposit into CurrentAccount
    }

    override fun withdraw(amount: BigDecimal) {
        // Withdraw from CurrentAccount
    }
}