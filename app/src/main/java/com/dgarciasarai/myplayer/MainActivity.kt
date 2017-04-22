package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = MediaAdapter(fetchMedia()) {
            toast(it.title)
        }

        TextView(this).apply2 {
            textSize = 20f
        }
    }
}

fun <T : Any> T.apply2(f: T.() -> Unit): T {
    this.f()
    return this
}