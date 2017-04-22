package com.dgarciasarai.myplayer

/**
 * @author Sarai Díaz García
 */
data class Item(val title: String, val url: String, val type: Type) {
    enum class Type { PHOTO, VIDEO }
}