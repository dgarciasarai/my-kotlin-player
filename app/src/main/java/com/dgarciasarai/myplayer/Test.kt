package com.dgarciasarai.myplayer

import android.view.View

/**
 * @author Sarai Díaz García
 */
fun test(view: View) {

    val item: Item? = null
    item.title //Null
    item?.title //Good!

    // Elvis operator
    val notNullItem : Item = item ?: Item("Item 1", "Url 1", Item.Type.PHOTO)

    //!! operator
    val title: String = item!!.title
}