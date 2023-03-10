package open_closed.exercise_2.bad

import java.util.*
import java.util.function.Supplier
import java.util.stream.Collectors

class BankCustomer {
    private val basicAccounts: MutableList<BasicAccount>
    private val checkingAccounts: MutableList<CheckingAccount>
    private val monthlyInterestAccounts: MutableList<MonthlyInterestAccount>
    private val yearlyInterestAccounts: MutableList<YearlyInterestAccount>

    init {
        basicAccounts = java.util.ArrayList()
        checkingAccounts = java.util.ArrayList()
        monthlyInterestAccounts = java.util.ArrayList()
        yearlyInterestAccounts = java.util.ArrayList()
    }

    fun openBasicAccount(initialBalance: Double) {
        basicAccounts.add(BasicAccount(initialBalance))
    }

    fun openCheckingAccount(initialBalance: Double) {
        checkingAccounts.add(CheckingAccount(initialBalance))
    }

    fun openMonthlyInterestAccount(initialBalance: Double) {
        monthlyInterestAccounts.add(MonthlyInterestAccount(initialBalance))
    }

    fun openYearlyInterestAccount(initialBalance: Double) {
        yearlyInterestAccounts.add(YearlyInterestAccount(initialBalance))
    }

    fun calculateInterest(numberOfMonths: Int) {
        for (account in monthlyInterestAccounts) {
            account.applyInterest(numberOfMonths)
        }
        val numberOfYears = numberOfMonths / 12
        for (account in yearlyInterestAccounts) {
            account.applyInterest(numberOfYears)
        }
    }

    val allAccountIds: List<UUID>
        get() {
            val uuids = java.util.ArrayList<UUID>()
            uuids.addAll(
                basicAccounts.stream()
                    .map { obj: BasicAccount -> obj.accountId }
                    .collect(
                        Collectors.toCollection(
                            Supplier { ArrayList() })
                    )
            )
            uuids.addAll(
                checkingAccounts.stream()
                    .map { obj: CheckingAccount -> obj.accountId }
                    .collect(
                        Collectors.toCollection(
                            Supplier { ArrayList() })
                    )
            )
            uuids.addAll(
                monthlyInterestAccounts.stream()
                    .map { obj: MonthlyInterestAccount -> obj.accountId }
                    .collect(
                        Collectors.toCollection(
                            Supplier { ArrayList() })
                    )
            )
            uuids.addAll(
                yearlyInterestAccounts.stream()
                    .map { obj: YearlyInterestAccount -> obj.accountId }
                    .collect(
                        Collectors.toCollection(
                            Supplier { ArrayList() })
                    )
            )
            return uuids
        }
}