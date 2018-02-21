package com.omrobbie.variables


/**
 * Created by omrobbie on 22/02/2018.
 */

class TeacherClass(override var name: String, override var age: Int) : PersonInterface {

    override fun info(name: String, age: Int, salary: Int) {
        var mSalary = salary * 2
        var mAge = age * 2

        println(name)
        println(mAge)
        println(mSalary)
    }

    override fun experience(subject: String, experience: Int) {
        println(subject)
        println(experience)
    }

}