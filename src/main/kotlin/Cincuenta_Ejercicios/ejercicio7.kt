package Cincuenta_Ejercicios
fun main(paramero:Array<String>) {
    println("BASE: ")
    var BASE = readln().toDouble()
    println("ALTURA: ")
    var ALTURA = readln().toDouble()
    var SUPERFICIE = (BASE * ALTURA) / 2
    println("La superficie del triangulo es de $SUPERFICIE cm²")
}