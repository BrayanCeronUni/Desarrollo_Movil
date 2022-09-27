package Cincuenta_Ejercicios
import kotlin.math.pow
fun main(paramero:Array<String>){
    println("numero: ")
    var NUM= readln().toDouble()
    var CUADRADO= NUM.pow(2)
    var CUBO= NUM.pow(3)
    println("El cuadrado de $NUM es $CUADRADO y el cubo es $CUBO")
}