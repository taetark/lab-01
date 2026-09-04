package com.example.petshop

class Dog(name: String, age: Int): Pet(name,age), PetTable {
    override fun speak(): String {
        return "woof"
    }
    override fun pet()
    {
        println("The dog $name is being petted")
    }
}