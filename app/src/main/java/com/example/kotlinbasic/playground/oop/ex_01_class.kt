package com.example.kotlinbasic.playground.oop

import com.example.kotlinbasic.playground.basic.name

fun main() {
    val obj1 = PrimaryClass("aa",123)
    println("obl1.name: ${obj1.name}")
    val obj1111 = PrimaryClass("aa",123)
    println("xxxx: ${obj1 == obj1111}")
    obj1.display()
    println()
    val obj2 = Secondary()
    println("obl2.name: ${obj2.name}")
    obj2.display()
    println()
    val obj3 = Secondary("aa",30)
    print("obl3.name: ${obj3.name}")
    obj3.display()
    println()
    val obj4 = PSClass(80 ,"aa")
    println("obl4.score: ${obj4.name},${obj4.score}")
    println()
    val obj5 = PSClass(80 )
    println("obl5.score: ${obj5.name},${obj5.score}")
    println()
 //   show ture : compare instant check data
    val obj6 = DataClass("aa",123)
    val obj7 = DataClass("aa",123)
    val obj8 = PrimaryClass("aa",123)
    println("xxxx : ${obj6 .toString()}")
    println("xxxx : ${obj6 == obj7}")
    println("xxxx : ${obj8 .toString()}")

    val (name,age)=DataClass("aa" ,123)
    println("name : $name , age: $age")
}
class PrimaryClass (val name: String,val age: Int){
    fun display(){
        val result = "name: $name, age: $age"
        println("Primary: $result")
    }


    class PrimaryClass (val name: String,val age: Int){
        init {
            print("primary init")
        }
        // init{
// println("primary init2")
//
        init{
            println("init age: $age")
    }
        fun display(){
            val result = "name: $name, age: $age"
            println("Primary: $result")
        }
    }
}
//class PrimaryClass constructor(val name: String,val age: Int){
//      fun display(){
//          val result = "name; $name, age: $age"
//          println("Primary: $result")
//  }
//}
//classPrimaryClass{
// val name:String = ""
//val age : Int 123
//Primary (name: String, age: Int){
// this.name=name
//    this.age=age
// }
//}
class  Secondary{
    var name: String = ""
    var age: Int = 0
//    val  name: String
//    val  age: Int
    constructor(){
        this.name = ""
        this.age = 0
    }
    constructor(name: String){
        this.name = name
        this.age = 0
    }
    constructor(name: Int){
        this.name = ""
        this.age = age
    }
    //overload
    constructor(name: String,age: Int){
        this.name = name
        this.age = age
    }
    init {
        println("Secondary init")
    }
    //    init {
//            println("Secondary init")
//    }
    init {
        println("Secondary age: $age")
    }
    fun display(){
        val result = "name: $name, age: $age"
        println("Primary: $result")
    }
}

class  PSClass(val score:Int, val name: String){
    constructor(score: Int):this(name = "xx", score = score){

    }
}
data class DataClass(var name: String, var age: Int){
    constructor(age: Int):this(name = "xx", age = age){

    }
}