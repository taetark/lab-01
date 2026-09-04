package com.example.petshop

abstract class Mood (val date: String) {
    abstract fun mood(): String
}

class Happy (date: String) : Mood(date) {
    override fun mood(): String {
        return "I'm very happy on $date"
    }
}

class Sad (date: String) : Mood(date) {
    override fun mood(): String {
        return "I'm very sad on $date"
    }

}