package com.omrobbie.variables


/**
 * Created by omrobbie on 22/02/2018.
 */

class StudentClass(override var name: String, override var age: Int) : PersonInterface {

    override fun info(name: String, age: Int, salary: Int) {
        var salary = salary * 3

        println(name)
        println(age)
        println(salary)
    }

    override fun experience(subject: String, experience: Int) {
        var experience = experience + 1

        println(subject)
        println(experience)
    }

}