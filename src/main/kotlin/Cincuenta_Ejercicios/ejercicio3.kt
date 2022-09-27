package Cincuenta_Ejercicios

fun main(paramero:Array<String>){
    var Nota=0
    for (i in 1..5){
        println("ingrese la nota $i:")
        Nota+= readln().toInt()}
    var PROMEDIO:Double= (Nota/5.0)
    println("La nota promedio de su semestre es $PROMEDIO")
}