package com.dgarciasarai.myplayer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * @author Sarai Díaz García
 */
class MediaAdapter(val data: List<Item>) : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        return MediaViewHolder(v)
    }

    override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size

    class MediaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title = itemView.findViewById(R.id.media_title) as TextView
        val thumb = itemView.findViewById(R.id.media_thumb) as ImageView

        fun bind(item: Item) {
            title.text = item.title
            Picasso.with(thumb.context).load(item.url).into(thumb)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, item.title, Toast.LENGTH_SHORT).show()
            }
        }
    }
}