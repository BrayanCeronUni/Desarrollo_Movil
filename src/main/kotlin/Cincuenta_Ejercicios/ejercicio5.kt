package Cincuenta_Ejercicios
import kotlin.math.pow
fun main(paramero:Array<String>){
    println("BASE: ")
    var BASE= readln().toDouble()
    println("ALTURA: ")
    var ALTURA= readln().toDouble()
    var PERIMETRO= 2*(BASE+ALTURA)
    var SUPERFICIE= BASE*ALTURA
    println("El perimetro del rectangulo es $PERIMETRO mts y la superficie es $SUPERFICIE mts²")
}