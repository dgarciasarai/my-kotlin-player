package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_ITEM_ID = "DetailActivity:itemId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra(EXTRA_ITEM_ID, -1)

        val item = MediaProvider.fetchMedia().firstOrNull() { it.id == id }

        if (item != null) {
            supportActionBar?.title = item.title
            detail_thumb.loadUrl(item.url)
            detail_video_indicator.visible = item.type == Item.Type.VIDEO
        }
    }
}
