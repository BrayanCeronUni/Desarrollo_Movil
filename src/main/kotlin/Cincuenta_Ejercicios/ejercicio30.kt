package Cincuenta_Ejercicios
import kotlin.math.pow
fun main(parametro: Array<String>) {
    print("ingrese un numero: ")
    val n = readln().toInt()
    for (i in 1..n){
        var elev= (Math.pow(i.toDouble(), i.toDouble()))
        println("la serie es: $elev")
        elev+1
    }
}