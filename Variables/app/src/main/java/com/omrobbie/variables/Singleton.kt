package com.omrobbie.variables


/**
 * Created by omrobbie on 22/02/2018.
 */

class Singleton {

    private constructor() {
        println("This is a singleton class")
    }

    companion object {
        val single: Singleton by lazy { Singleton() }
    }

}