package Cincuenta_Ejercicios
import kotlin.math.*
fun main(paramero:Array<String>) {
    print("ingrese la nota: ")
    val NOTA = readln().toInt()
    if (NOTA>= 8)
        println("APROBÓ")
    else
        println("REPROBÓ")
}