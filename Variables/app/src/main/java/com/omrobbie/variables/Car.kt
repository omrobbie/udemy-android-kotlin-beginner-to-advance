package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

open class Car {
    public open var name = "xyz"
    private var price = 123
    protected open var model = 2012
}

class Truck : Car() {
    override var model = 2013
}