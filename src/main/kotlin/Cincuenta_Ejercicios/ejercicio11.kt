package Cincuenta_Ejercicios
fun main(paramero:Array<String>) {
    println("dias: ")
    var DIAS= readln().toInt()
    var SEGUNDOS= DIAS * 24 * 60 * 60
    println("$DIAS dias equivale a $SEGUNDOS segundos")
}