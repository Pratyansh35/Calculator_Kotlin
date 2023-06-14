package com.example.myfirst_app

import java.time.Period

fun main(){
    var test = "hello"
    val my = 15
    //Data Types
    var a: Int = 15
    var b: String = "Hello"
    var c: Float = 1.5f
    var d: Double = 1.5
    var e: Boolean = true
    var f: Any = 14
    f = true
    f = 1.5
    f = 1.5f
    var currentTime = Time(hours = 1, minutes = 20, seconds = 12, period = Periodss.AM)
    println(currentTime)
    println(currentTime.hours)

    for(i in 1 until 10){
        print(i)
    }
    for(j in 1 .. 10 step 2){
        print(j)
    }

    for(i in 10 downTo 1){
        print(i)
    }
    var i: Any = 9
    when (i){
        5 -> print("Five")
        6 -> print("Six")
        9 -> println("Nine")
        "xyz" -> println("String")
    }

    print (Summ(5,8))
}
fun Summ(n1:Int,n2:Int):Int {
    var sum = n1 + n2
    return sum
}

data class Time (
    val hours: Int,
    val minutes: Int,
    val seconds: Int,
    val period: Periodss
)
enum class Periodss{
    AM,
    PM

}