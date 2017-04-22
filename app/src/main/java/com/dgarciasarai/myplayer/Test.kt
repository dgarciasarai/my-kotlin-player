package com.dgarciasarai.myplayer

import android.view.View
import android.widget.TextView

/**
 * @author Sarai Díaz García
 */
fun test(view: View) {

    val int = 20

    when {
        view is TextView -> print(view.text)
        System.currentTimeMillis() > 0 -> "System"
        int in 0..30 -> print("")
    }
}