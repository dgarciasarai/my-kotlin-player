package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    val adapter = MediaAdapter {
        startActivity<DetailActivity>(DetailActivity.EXTRA_ITEM_ID to it.id)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = adapter

        progress.visible = true

        MediaProvider.dataAsync { items ->
            adapter.data = items
            progress.visible = false
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        progress.visible = true
        MediaProvider.dataAsync { items ->
            adapter.data = when (item.itemId) {
                R.id.filter_all -> items
                R.id.filter_photos -> items.filter { it.type == Item.Type.PHOTO }
                R.id.filter_videos -> items.filter { it.type == Item.Type.VIDEO }
                else -> items
            }
            progress.visible = false
        }

        return true
    }
}