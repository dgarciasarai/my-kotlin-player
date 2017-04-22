package com.dgarciasarai.myplayer

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * @author Sarai Díaz García
 */
fun test(view: View) {

    when (view) {
        is TextView -> print(view.text)
        is ViewGroup -> print("Children: ${view.childCount}")
    }

    val int = 10

    val result: Any = when (int) {
        in 5..10 -> "Low value"
        0 -> "Try again"
        0, 3, 50 -> 2 //Zero takes previous case
        in 70..120 -> "Perfect value!"
        else -> throw IllegalStateException("Value not valid!")
    }
}