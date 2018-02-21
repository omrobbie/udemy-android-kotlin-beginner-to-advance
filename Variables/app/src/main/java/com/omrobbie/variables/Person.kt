package com.omrobbie.variables


/**
 * Created by omrobbie on 22/02/2018.
 */

open class Person() {

    open fun myInfo(name: String, age: Int, qualification: String) {
        println("Name is " + name)
        println("Age is " + age)
        println("Qualification is " + qualification)
    }

}