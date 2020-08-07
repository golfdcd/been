package com.example.kotlinbasic.playground.basic

fun main(){
    normalFunction()
    argumentFunction(  1150 ,  1112)
    println (returnFunction1())
    println (returnFunction2())
    println (returnFunction3(1150 , 1112))
    optionalFunction(1150)
    optionalFunction(1150 , 1112)
    optionalFunction( x2= 1150 , x1= 1112)

    //Lambda Expresstion
    val lambdal1 :(Int, Int)->Int={x1, x2 -> x1+x2} //-> =return
    println(lambdal1(1150,1112))
    val lambdal2 :(Int, Int)->Int={x1:Int , x2:Int -> x1+x2}//->return
    println(lambdal2(1150,1112))

    //with out lambda
    fun xxx(x1: Int, x2: Int):Int{
        return  x1+x2
    }
    println(xxx( 1150, 1112))

}
fun normalFunction(){
    println("normalFunction")
}

fun argumentFunction(x1 :Int,x2 :Int){
    println("sum: $x1 + $x2")
    println("sum: ${x1 + x2}")
}

fun returnFunction1():String{
    return "iBlurBlur"
}
fun returnFunction2() ="iBlurBlur"

fun returnFunction3(x1: Int,x2 :Int)= x1+x2

fun optionalFunction(x1: Int,x2 :Int =0 ){
    println("sum: ${x1 + x2}")
}