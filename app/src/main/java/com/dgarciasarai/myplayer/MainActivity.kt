package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var observedNumber by Delegates.observable(0) { p, old, new ->
        Log.d("actual: $p", "old value: $old, new value: $new")
    }

    val positiveNumber by Delegates.vetoable(0) { p, old, new ->
        new >= 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = MediaAdapter(fetchMedia()) { toast(it.title) }

        observedNumber = 20
    }
}