package com.example.memorygame.models

enum class BoardSize(val numCards: Int) {
    BASIC(8),
    AMATUER(18),
    PRO(24);

    fun getWidth(): Int {
        return when (this) {
            BASIC -> 2
            AMATUER -> 3
            PRO -> 4
        }
    }

    fun getHeight(): Int {
        return numCards / getWidth()
    }

    fun getNumPairs(): Int {
        return numCards / 2
    }
}