package com.dgarciasarai.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_media_item.view.*

/**
 * @author Sarai Díaz García
 */
class MediaAdapter(val data: List<Item>) : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
        return MediaViewHolder(parent.inflate(R.layout.view_media_item))
    }

    override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size

    class MediaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Item) {
            itemView.media_title.text = item.title
            itemView.media_thumb.loadUrl(item.url)
            itemView.media_video_indicator.visible = item.type == Item.Type.VIDEO
            itemView.setOnClickListener { toast(item.title) }
        }
    }
}