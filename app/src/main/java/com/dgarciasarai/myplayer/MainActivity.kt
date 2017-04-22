package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = find<RecyclerView>(R.id.recycler)
        recyclerView.adapter = MediaAdapter(fetchMedia())

        toast("Hello Kotlin!")
        toast("Hello World with looong toast", Toast.LENGTH_LONG)

        startActivity<MainActivity>()
    }
}