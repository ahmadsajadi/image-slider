package com.example.image_slider

class Slider {
    var x = 10

    fun getx():Int{
        return x
    }

    var array = ArrayList<String>()
    fun getString(): String {
        array.add("tester")
        array.add("hello1")
        array.add("hello2")
        array.add("hello3")
        return array.filter { s -> s.equals("tester") }.first()
    }
}