package com.dgarciasarai.myplayer

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * @author Sarai Díaz García
 */

object MediaProvider {

    fun dataAsync(f: (List<Item>) -> Unit) {
        doAsync {
            val data = fetchMedia()
            //More realistic...
            Thread.sleep(2000)
            uiThread {
                f(data)
            }
        }
    }

    fun fetchMedia() =
        (1..10).map {
            Item(it, "Title $it", "http://lorempixel.com/400/400/cats/$it",
                if (it % 3 == 0) Item.Type.VIDEO else Item.Type.PHOTO)
        }
}