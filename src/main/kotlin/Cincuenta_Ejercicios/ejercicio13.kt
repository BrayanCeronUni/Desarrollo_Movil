package Cincuenta_Ejercicios
import kotlin.math.pow
import kotlin.math.sqrt
fun main(paramero:Array<String>) {
    println("punto 1 Y: ")
    var P1_Y= readln().toDouble()
    println("punto 1 X: ")
    var P1_X= readln().toDouble()
    println("punto 2 Y: ")
    var P2_Y= readln().toDouble()
    println("punto 2 X: ")
    var P2_X= readln().toDouble()
    var D= sqrt((P1_X - P2_X).pow(2) + (P1_Y - P2_Y).pow(2))
    println("punto A= X:$P1_X, Y:$P1_Y")
    println("punto B= X:$P2_X, Y:$P2_Y")
    println("Distancia $D mts")
}