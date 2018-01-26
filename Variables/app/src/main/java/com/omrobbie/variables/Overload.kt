package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

class Overload {

    fun sum(num1: Int): Int {
        return num1
    }

    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun sum(num1: Int, num2: Int, num3: Int): Int {
        return num1 + num2 + num3
    }


}