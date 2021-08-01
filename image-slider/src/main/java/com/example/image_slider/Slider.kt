package com.example.image_slider

import android.content.Context
import com.google.android.exoplayer2.SimpleExoPlayer




class Slider {
    var player : SimpleExoPlayer? = null
    var array = ArrayList<String>()
    var x = 10

    fun getx():Int{
        return x
    }


    fun getString(): String {
        array.add("tester")
        array.add("hello1")
        array.add("hello2")
        array.add("hello3")
        return array.filter { s -> s.equals("tester") }.first()
    }

    fun setPlayer(context: Context){
        player = SimpleExoPlayer.Builder(context).build()
    }

    fun play(){
        player?.play()
    }

    fun stop(){
        player?.stop()
    }
}