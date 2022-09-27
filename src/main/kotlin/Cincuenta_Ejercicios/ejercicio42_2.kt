package Cincuenta_Ejercicios

fun main(){
    println("tablas")
    var x=1
    var n1=1
    for (i in 1..10){
        for (b in 1..10){
            n1=i * b
            println("$i*$b=$n1")
            x+=1
        }
        println()
}}