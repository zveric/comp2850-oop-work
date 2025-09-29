// Task 15.2.3

open class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance: Int = 0
        private set(value) {
            require(value >= 0) { "Balance cannot be negative" }
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be > 0" }
        balance += amount
    }

    fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be > 0" }
        balance -= amount
    }
}
