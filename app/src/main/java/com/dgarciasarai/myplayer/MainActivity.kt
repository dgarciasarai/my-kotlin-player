package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = MediaAdapter(fetchMedia()) {
            toast(it.title)
        }

        val textView = with2(TextView(this)) {
            textSize = 20f
        }

        val viewGroup: ViewGroup = FrameLayout(this)
        val list: List<View> = viewGroup.filterViews { it.visible }
    }
}

fun <T : Any> T.apply2(f: T.() -> Unit): T {
    this.f()
    return this
}

fun <T : Any> with2(obj: T, f: T.() -> Unit): T {
    obj.f()
    return obj
}

fun ViewGroup.filterViews(condition: (View) -> Boolean): List<View> {
    val list = mutableListOf<View>()
    for (i in 0 until childCount) {
        val view = getChildAt(i)
        if (condition(view)) {
            list.add(view)
        }
    }
    return list
}