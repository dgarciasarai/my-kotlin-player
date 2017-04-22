package com.dgarciasarai.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlin.properties.Delegates
import kotlinx.android.synthetic.main.view_media_item.view.media_thumb as mediaThumb
import kotlinx.android.synthetic.main.view_media_item.view.media_title as mediaTitle
import kotlinx.android.synthetic.main.view_media_item.view.media_video_indicator as mediaVideoIndicator

/**
 * @author Sarai Díaz García
 */
typealias Listener = (Item) -> Unit

class MediaAdapter(val listener: Listener) :
    RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

    var data: List<Item> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
        return MediaViewHolder(parent.inflate(R.layout.view_media_item))
    }

    override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener { listener(data[position]) }
    }

    override fun getItemCount() = data.size

    class MediaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Item) = with(itemView) {
            mediaTitle.text = item.title
            mediaThumb.loadUrl(item.url)
            mediaVideoIndicator.visible = item.type == Item.Type.VIDEO
            setOnClickListener { toast(item.title) }
        }
    }
}