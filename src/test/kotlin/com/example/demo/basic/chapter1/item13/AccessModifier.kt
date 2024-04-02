package com.example.demo.basic.chapter1.item13

class Account {
    // private set을 통해 setter만 감추고 getter만 열어줄 수 있음
    var balance: Long = 0
        private set

    var accountName: String = ""
        get() = "계좌이름:$field"

    fun increaseBalance(value: Int) {
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        this.balance -= value
    }
}


fun main() {
    val account = Account()
//    컴파일 에러 발생
//    account.balance = 100
    account.increaseBalance(100)
    account.accountName = "급여계좌"

    println("balance : ${account.balance}, name: ${account.accountName}")
}
