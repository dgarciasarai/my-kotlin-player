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

        val filter = when (item.itemId) {
            R.id.filter_photos -> Filter.ByType(Item.Type.PHOTO)
            R.id.filter_videos -> Filter.ByType(Item.Type.VIDEO)
            else -> Filter.None
        }

        MediaProvider.dataAsync { items ->
            adapter.data = when (filter) {
                is Filter.ByType -> items.filter { it.type == filter.type }
                is Filter.None -> items
            }
            progress.visible = false
        }

        return true
    }
}