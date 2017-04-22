package com.dgarciasarai.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.view_media_item.view.media_thumb as mediaThumb
import kotlinx.android.synthetic.main.view_media_item.view.media_title as mediaTitle
import kotlinx.android.synthetic.main.view_media_item.view.media_video_indicator as mediaVideoIndicator

/**
 * @author Sarai Díaz García
 */
class MediaAdapter(val data: List<Item>,
    val listener: (Item) -> Unit) : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

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

            //val textView = TextView(itemView.context)
            //textView.text = "wow"
            //textView.visible = true
            //textView.textSize = 20f

            val textView = TextView(itemView.context).apply {
                text = "wow"
                visible = true
                textSize = 20f
            }
        }
    }
}