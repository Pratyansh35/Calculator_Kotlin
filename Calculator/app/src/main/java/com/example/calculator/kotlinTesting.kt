package com.example.calculator

fun main() {
//    println(4f / 5f )
//    val tempValue: MutableList<Int> = mutableListOf(12,3,4,5)
//    print(tempValue.joinToString(""))

    var values1: Int = 55
    var values2: Int = 5
    var operate =  "+"
    var percent = "%"


    var calculate: String = if (percent != "%") {
        when (operate) {
            "+" -> (values1 + values2).toString()
            "-" -> (values1 - values2).toString()
            "x" -> (values1 * values2).toString()
            "/" -> (values1.toFloat() / values2.toFloat()).toString()
            else -> "logic Error"
        }
    } else {
        when (operate) {
            "+" -> ( values1.toFloat() + (values1.toFloat() * values2.toFloat()) / 100 ).toString()
            "-" -> (values1.toFloat() - ((values1.toFloat() / 100) * values2.toFloat())).toString()
            else -> "logic Error"
        }
    }
    print(calculate)
}

