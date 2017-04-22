package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter = MediaAdapter { toast(it.title) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = adapter
        adapter.data = fetchMedia()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val media = fetchMedia()
        adapter.data = when (item.itemId) {
            R.id.filter_all -> media
            R.id.filter_photos -> media.filter { it.type == Item.Type.PHOTO }
            R.id.filter_videos -> media.filter { it.type == Item.Type.VIDEO }
            else -> media
        }

        return true
    }
}