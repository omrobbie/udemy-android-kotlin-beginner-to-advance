package com.omrobbie.variables

/**
 * Created by omrobbie on 27/01/2018.
 */

class Player3(name: String, score: Int, energy: Int, weapon: String)
    : Player2(name, score, energy, weapon) {

    override fun damage(damagePoint: Int) {
        super.damage(damagePoint / 4)
    }
}
