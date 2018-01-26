package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

open class Player1 {
    var name: String = ""
    var score: Int = 0
    var energy: Int = 0
    var weapon: String = ""

    constructor(name: String, score: Int, energy: Int, weapon: String) {
        this.name = name
        this.score = score
        this.energy = energy
        this.weapon = weapon
    }

    fun killEnemy() {
        score = score + 8
        println("Your score is $score")
    }

    open fun damage(damagePoint: Int) {
        energy = energy - damagePoint

        if (energy > 0) {
            println("Your energy is $energy")
        } else {
            println("You are dead!")
        }
    }

    fun showAll() {
        println("Player Profile:")
        println("Name = $name")
        println("Score = $score")
        println("Energy = $energy")
        println("Weapon = $weapon")
    }
}