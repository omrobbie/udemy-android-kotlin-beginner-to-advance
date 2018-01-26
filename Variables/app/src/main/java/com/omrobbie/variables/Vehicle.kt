package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

enum class Company { TOYOTA, SUZUKI, HONDA }

class Vehicle {
    var name: String = ""
    var model: Int = 0
    var price: String = ""
    var company: Company

    constructor(name: String, model: Int, price: String, company: Company) {
        this.name = name
        this.model = model
        this.price = price
        this.company = company
    }
}