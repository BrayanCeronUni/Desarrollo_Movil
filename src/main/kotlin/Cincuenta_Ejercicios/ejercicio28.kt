package Cincuenta_Ejercicios

import kotlin.math.pow

fun main() {
    println("cuantos valores ingresará: ")
    val n= readln().toDouble()
    var x= 1
    var cubo=0.0
    while (x<=n) {
        println("ingrese un dato: ")
        val dato = readln().toDouble()
        if (dato>0){
            cubo= (dato.pow(3))
            println("el cubo de $dato es: $cubo")
            x++
        }
    }
}