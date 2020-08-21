package com.example.kotlinbasic.playground.basic


fun main() {
    var cast1: Any="iBlur"
    if(cast1 is String) {
        val cast2 = cast1 as String
        print(cast2.length)
    }else{
        print("cast1 not String")
    }
    val cast2 = cast1 as? Int
}

            
