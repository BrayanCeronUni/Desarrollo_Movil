package Cincuenta_Ejercicios

fun main(){
    println("cantidad de alumnos: ")
    var cant_a= readln().toDouble()
    println("cantidad de notas: ")
    var cant_n= readln().toDouble()
    var sum_nota:Double=0.0
    for (i in 1..cant_a.toInt()){
        for (b in 1..cant_n.toInt()){
            println("ingrese una nota de alumno $i")
            var nota= readln().toInt()
            sum_nota+=nota}
    }
    var prom:Double= sum_nota/(cant_n*cant_a)
    println("el promedio por alumno es: $prom")}