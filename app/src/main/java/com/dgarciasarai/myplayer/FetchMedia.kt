package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
fun fetchMedia() =
    (0..10).map {
        Item("Title $it", "http://lorempixel.com/400/400/cats/$it",
            if (it % 3 == 0) Item.Type.VIDEO else Item.Type.PHOTO)
    }