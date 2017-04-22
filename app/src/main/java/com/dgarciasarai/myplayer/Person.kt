package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
open class Person(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

class Developer(name: String) : Person(name, 24)