package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
open class Person(val name: String, val age: Int)

class Developer(name: String) : Person(name, 24)

class MyClass(val name: String = "", val age: Int = 20)

fun test() {
    val myValDefault = MyClass()
    val myValName = MyClass("MyName")
    val myValNameAge = MyClass("MyName", 25)
    val myValAge = MyClass(age = 30)
}