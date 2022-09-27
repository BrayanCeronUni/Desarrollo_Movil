package Cincuenta_Ejercicios

fun main() {
    var par=0
    var contPar=0
    var imp=0
    for (i in 1..3) {
        println("ingrese numero: ")
        var num = readln().toInt()
        if (num % 2 == 0) {
            par += num
            contPar++
        } else
            imp += num
    }
    var prom=par/contPar
    println("la suma de los impares es $imp")
    println("el promedio de los pares es $prom")
}