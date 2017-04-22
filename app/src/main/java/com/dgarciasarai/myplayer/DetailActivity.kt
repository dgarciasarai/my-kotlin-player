package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_ITEM_ID = "DetailActivity:itemId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra(EXTRA_ITEM_ID, -1)

        val item = MediaProvider.fetchMedia().firstOrNull() { it.id == id }
    }
}
