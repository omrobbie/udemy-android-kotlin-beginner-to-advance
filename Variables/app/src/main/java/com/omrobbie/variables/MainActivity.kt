package com.omrobbie.variables

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var1()
        var2()
        var3()
        var4()
        var5()
    }

    fun var1() {
        var num1 = 8
        var num2 = 9
        var name = "omrobbie"
        var f = 2.1

        var sum = num1 + num2 + f
        println(sum)
        println(name)
    }

    fun var2() {
        var num1: Int
        var name: String

        num1 = 87
        name = "omrobbie"

        println(num1)
        println(name)
    }

    fun var3() {
        // ? for allowing null value
        var num1: Int?
        var name: String?

        num1 = null
        name = null
        println(num1 + " | " + name)

        num1 = 9
        name = "omrobbie"
        println("$num1 | $name")
    }

    fun var4() {
        var name: String = "Kotlin"
        val num1: Int = 10 //val = cannot update the value

        name = "omrobbie"
        //num1 = 8

        println(num1)
        println(name)
    }

    fun var5() {
        println("Enter the name")
        var name: String? = readLine().toString()
        println("Enter age")
        var age: Int? = readLine()!!.toInt()
        println("Enter date of birth")
        var dob: Int? = readLine()!!.toInt()

        print("Name: $name, Age: $age, DateOfBirth: $dob")
    }
}
