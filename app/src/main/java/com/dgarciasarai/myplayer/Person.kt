package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
open class Person(name: String, age: Int) {
    val name: String = name
    val age: Int = age
}

class Developer(name: String) : Person(name, 24)