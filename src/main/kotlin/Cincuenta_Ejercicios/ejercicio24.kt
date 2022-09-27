package Cincuenta_Ejercicios
fun main() {
    print("inserete el numero: ")
    var NUMERO= readln().toInt()
    if (NUMERO==0)
        println("el numero $NUMERO es nulo")
    else
        if (NUMERO % 2==0)
            println("el numero $NUMERO es par")
        else
            println("el numero $NUMERO es impar")
}