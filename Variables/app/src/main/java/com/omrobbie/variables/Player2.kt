package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

open class Player2(name: String, score: Int, energy: Int, weapon: String)
    : Player1(name, score, energy, weapon) {

    override fun damage(damagePoint: Int) {
        super.damage(damagePoint / 4)
    }
}