package com.dgarciasarai.myplayer

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast

/**
 * @author Sarai Díaz García
 */
fun Context.toast(msg: String, length: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, msg, length).show()

fun RecyclerView.ViewHolder.toast(msg: String, length: Int =
Toast.LENGTH_SHORT) = itemView.context.toast(msg, length)

fun ViewGroup.inflate(@LayoutRes layoutRes: Int) =
    LayoutInflater.from(context).inflate(layoutRes, this, false)