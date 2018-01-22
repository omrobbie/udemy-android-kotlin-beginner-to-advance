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
        var6()
        var7()
        var8()
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
        var name: String? = "Kotlin" //readLine().toString()
        println("Enter age")
        var age: Int? = 22 //readLine()!!.toInt()
        println("Enter date of birth")
        var dob: Int? = 1//readLine()!!.toInt()

        print("Name: $name, Age: $age, DateOfBirth: $dob")
    }

    fun var6() {
        var num1: Int = 10
        var name: String = "Kotlin"
        var f: Float = 2.34f
        var name2: String = "10"

        var res1 = f.toInt()
        var res2 = num1.toFloat()
        var res3 = name2.toInt()

        println("Float to Int: $res1")
        println("Int to Float: $res2")
        println("String to Int: $res3")
    }

    fun var7() {
        var num1: Int = 10
        var num2: Int = 8
        var name: String = "Kotlin"

        var res1 = num1 == num2
        println(res1)

        var res2 = num1 > num2
        var res3 = num1 < num2

        var res4 = num1 >= num2
        var res5 = num1 <= num2

        println("\n$res2 \n$res3 \n$res4 \n$res5")
    }

    fun var8() {
        var name1: String = "Kotlin"
        var name2: String = "kotlin"

        var res1 = name1 == name2
        println(res1)

        var name3: String = "abc"
        var name4: String = "abcd"

        var res2 = name3.length <= name4.length
        println(res2)
    }
}
