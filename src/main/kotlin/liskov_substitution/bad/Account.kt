package liskov_substitution.bad

import java.math.BigDecimal

abstract class Account {
    protected abstract fun deposit(amount: BigDecimal)

    /**
     * Reduces the account balance by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
    abstract fun withdraw(amount: BigDecimal)
}