package com.dgarciasarai.myplayer

import android.view.View
import android.widget.TextView

/**
 * @author Sarai Díaz García
 */
fun test(view: View) {
    val int = if (view is TextView) 0 else 1
}