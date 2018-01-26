package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

class Dog {
    var name: String = ""
    var color: String = ""
    var weight: Int = 0
    var gender: String = ""
    var age: Int = 0

    constructor(name: String, color: String, weight: Int) {
        this.name = name
        this.color = color
        this.weight = weight
    }

    constructor(gender: String, age: Int) {
        this.gender = gender
        this.age = age
    }

    fun dogPrice(price: String) {
        println("The price of the dog is $price")
    }
}