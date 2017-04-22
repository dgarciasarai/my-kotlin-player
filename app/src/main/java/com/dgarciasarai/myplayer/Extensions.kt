package com.dgarciasarai.myplayer

import android.content.Context
import android.widget.Toast

/**
 * @author Sarai Díaz García
 */
fun Context.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()