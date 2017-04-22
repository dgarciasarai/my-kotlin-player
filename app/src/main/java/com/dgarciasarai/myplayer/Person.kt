package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
open class Person(val name: String, val age: Int)

class Developer(name: String) : Person(name, 24)

fun test() {
    val person = Person("Name", 20)
    person.name
}