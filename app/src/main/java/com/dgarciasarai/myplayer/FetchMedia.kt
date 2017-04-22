package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
fun fetchMedia(): List<Item> = listOf(
    Item("Title 1", "http://lorempixel.com/400/400/cats/1", Item.Type.PHOTO),
    Item("Title 2", "http://lorempixel.com/400/400/cats/2", Item.Type.VIDEO),
    Item("Title 3", "http://lorempixel.com/400/400/cats/3", Item.Type.PHOTO),
    Item("Title 4", "http://lorempixel.com/400/400/cats/4", Item.Type.PHOTO),
    Item("Title 5", "http://lorempixel.com/400/400/cats/5", Item.Type.VIDEO),
    Item("Title 6", "http://lorempixel.com/400/400/cats/6", Item.Type.VIDEO),
    Item("Title 7", "http://lorempixel.com/400/400/cats/7", Item.Type.PHOTO),
    Item("Title 8", "http://lorempixel.com/400/400/cats/8", Item.Type.PHOTO),
    Item("Title 9", "http://lorempixel.com/400/400/cats/9", Item.Type.VIDEO),
    Item("Title 10", "http://lorempixel.com/400/400/cats/10", Item.Type.PHOTO)
)