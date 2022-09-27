package Cincuenta_Ejercicios

fun main(){
    print("ingrese un numero: ")
    val n = readLine()!!.toInt()
    var s_impares = 0
    var s_pares = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            s_pares += i
        } else {
            s_impares += i
        }
    }
    println("la suma de los numeros impares es: $s_impares")

    println("la suma de los numeros pares es $s_pares")
}