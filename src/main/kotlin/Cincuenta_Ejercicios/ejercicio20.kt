package Cincuenta_Ejercicios

import kotlin.math.pow
import kotlin.math.sqrt

fun main(paramero:Array<String>) {
    print("inserte el valor de P: ")
    var P: Double= readln().toDouble()
    print("inserte el valor de Q: ")
    var Q:Double= readln().toDouble()
    var EXPRESION= (sqrt( P ).pow(3))+(sqrt( Q ).pow(4))-2*(sqrt( P ).pow(2))
    if (EXPRESION<680)
        println("Los valores de P y Q son validos")
    else
        println("Los valores de P y Q NO son validos")
}