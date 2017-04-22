package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
class Person(name: String, age: Int) {
    var name = name
        get() = "Name: $field"
        set(value) {
            if(value.isNotEmpty()) {
                field = value
            }
        } 
    var age = age
}

fun test() {
    val person = Person("Antonio", 31)
    val name = person.name
    person.name = "Miguel"
}