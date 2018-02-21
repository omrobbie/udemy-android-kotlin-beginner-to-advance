package com.omrobbie.variables


/**
 * Created by omrobbie on 22/02/2018.
 */

abstract class Account {
    var accountNo: Int = 1234
    var balance: Int = 123

    fun getData() {
        println("\nAcc No: " + accountNo + "\nBalance: " + balance)
    }
}