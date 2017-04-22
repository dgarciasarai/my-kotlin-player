package com.dgarciasarai.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

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

        val title = find<TextView>(R.id.media_title)
        val thumb = find<ImageView>(R.id.media_thumb)
        val mediaVideoIndicator = find<ImageView>(R.id.media_video_indicator)

        fun bind(item: Item) {
            title.text = item.title
            thumb.loadUrl(item.url)
            mediaVideoIndicator.visible(item.type == Item.Type.VIDEO)
            itemView.setOnClickListener { toast(item.title) }
        }
    }
}