package com.omrobbie.variables


/**
 * Created by omrobbie on 22/02/2018.
 */
interface PersonInterface {

    var name: String
    var age: Int

    fun info(name: String, age: Int, salary: Int)
    fun experience(subject: String, experience: Int)

}