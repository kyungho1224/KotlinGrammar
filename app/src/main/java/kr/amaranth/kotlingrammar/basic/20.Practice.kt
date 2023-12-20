package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val account = Account("김밀크", "2006/4/26", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    val eventAccount = EventAccount("김경호", "1984/12/24")
    println(eventAccount.checkBalance())

}

class Account {

    private val name: String
    private val birth: String
    private var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        }
        return false
    }

    fun save(amount: Int) {
        balance += amount
    }

}

class EventAccount(val name: String, val birth: String, private var balance: Int = 1000) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        }
        return false
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class GoodAccount(initialBalance: Int) {

    private var balance: Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        }
        return false
    }

    fun save(amount: Int) {
        balance += amount
    }

}

