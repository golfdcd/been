package com.example.kotlinbasic.playground.basic

        // complie time
        const val CONST_1 = 1150 //ค่าคงที่
        const val CONST_2 : Int = 1150

fun main() {
    println("hello")
    //mutable (Implicit) เปลี่ยนค่าได้
    var var1 ="iBlurBlur" // cammand  d =copy line
    var var2 =1234
    var var3 =true
    var var4 =12.55f // f or F
    var var5 =12.55
    var1 = "cat"
    println(var1)

    //mutable (Explicit)
    var var6 : String = "iBlurBlur"
    var var7 : Int = 1234
    var var8 : Boolean = true
    var var9 : Float = 12.55f // f or F
    var var10 : Double = 12.55
    var6 = "Dog"
    println(var1 + "," + var6 )

    //string template
    println("result : $var1, $var2, $var3, $var4, $var5")

    println("iBlurBlur"
    + "cat lover"
    +"<3")

    println("""
            iBlurBlur
            cat lover
            <3
            """)

    var money = 100_000_000 //10000000
    println(money)

    //Immutable เปลี่ยนค่าไม่ได้
    val val1 = "iBlurBlur" //Implicit
    val val2 : String = "iBlurBlur" //(Explicit)
    val val3 : String
    val3 = "inBlurBlur" //(Explicit)

    var any1 : Any
    any1 = "iBlurBlur"
    any1 = 1150
    any1 = true

    println(CONST_1)
    println(CONST_2)

}