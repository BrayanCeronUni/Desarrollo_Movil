package Cincuenta_Ejercicios

fun main(paramero:Array<String>) {
    print("ingrese la nota: ")
    var NOTA= readln().toInt()
    if (NOTA<8)
        println("APROBÓ")
    else
        println("REPROBÓ")
}