package Cincuenta_Ejercicios

fun main(){
    print("ingrese un numero: ")
    var primero = readln().toInt()
    for (i in -99..primero)
        println(i)
    println( "el numero mayor es $primero")
}