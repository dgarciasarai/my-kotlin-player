package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
sealed class Option {
    object None : Option()
    class Some(val value: Int) : Option()
}

fun test2(option: Option) {
    when(option) {
        is Option.Some -> print("value ${option.value}")
        is Option.None -> print("Empty option")
    }
}

sealed class Filter {
    object None: Filter()
    class ByType(val type: Item.Type): Filter()
}