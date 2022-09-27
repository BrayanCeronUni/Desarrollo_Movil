package Cincuenta_Ejercicios

fun main(paramero:Array<String>) {
    print("Sueldo del trabajador: ")
    var SUELDO= readln().toInt()
    if (SUELDO<1000) {
        var SUMA15= (SUELDO+((SUELDO*15)/100))
        println("Sueldo ajustado + 15%: $$SUMA15")
    }
    else{
        var SUMA12= (SUELDO+((SUELDO*12)/100))
        println("Sueldo ajustado + 12%: $$SUMA12") }
}