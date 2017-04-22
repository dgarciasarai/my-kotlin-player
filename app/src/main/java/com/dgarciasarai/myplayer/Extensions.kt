package com.dgarciasarai.myplayer

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.widget.Toast

/**
 * @author Sarai Díaz García
 */
fun Context.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

fun RecyclerView.ViewHolder.toast(msg: String) = itemView.context.toast(msg)