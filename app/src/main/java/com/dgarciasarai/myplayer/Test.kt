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
}