package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
interface Person {
    val name: String
    val age: Int

    fun getDescription() = "Name: $name, age: $age"
}

class Developer(override val name: String, override val age: Int) : Person

fun test() {
    val developer = Developer("Antonio", 31)
    val name = developer.name
    developer.getDescription()
}