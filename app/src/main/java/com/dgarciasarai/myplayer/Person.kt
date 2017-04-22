package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
open class Person(val name: String, val age: Int)

class Developer(name: String) : Person(name, 24)

class MyClass {
    val name: String
    val age: Int

    constructor(name: String) {
        this.name = name
        this.age = 20
    }

    constructor(age: Int) {
        this.name = ""
        this.age = age
    }
}

fun test() {
    val person = Person("Name", 20)
    person.name
}