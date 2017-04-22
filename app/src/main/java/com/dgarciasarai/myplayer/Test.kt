package com.dgarciasarai.myplayer

import android.view.View

/**
 * @author Sarai Díaz García
 */
fun test(view: View) {

    val item: Item? = null
    item.title //Null
    item?.title //Good!
}