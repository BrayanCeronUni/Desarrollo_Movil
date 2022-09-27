package Cincuenta_Ejercicios
fun main() {
    print("Inserte un numero entero: ")
    val NUMERO= readln().toInt()
    if (NUMERO>0)
        println("POSITIVO")
    else
        if (NUMERO<0)
            println("NEGATIVO")
        else
            println("NULO")
}