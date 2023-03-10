package liskov_substitution.bad

import java.math.BigDecimal

class BankingAppWithdrawalService(private val account: Account) {
    fun withdraw(amount: BigDecimal) {
        account.withdraw(amount)
    }
}