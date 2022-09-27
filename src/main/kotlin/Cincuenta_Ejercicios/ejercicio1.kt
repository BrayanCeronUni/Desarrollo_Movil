package Cincuenta_Ejercicios

fun main (parametro: Array<String>) {
    println("primer numero: ")
    var A: Int = readln().toInt()
    println("segundo numero")
    var B: Int = readln().toInt()
    println("tercer numero")
    var C: Int = readln().toInt()
    var primero = 0
    var segundo = 0
    var tercero = 0
    if (A < B && A < C) {
        tercero = A
    } else
        if (B < A && B < C)
            tercero = B
        else
            tercero = C
    if (A > B && A < C) {
        segundo = A
    } else
        if (B > A && B < C)
            segundo = B
        else segundo = C
    if (A > B && A > C)
        primero = A
    else
        if (B > A && B > C)
            primero = B
        else primero = C

    println("Los numero $A, $B y $C a la inversa son: $primero, $segundo, $tercero.")
}