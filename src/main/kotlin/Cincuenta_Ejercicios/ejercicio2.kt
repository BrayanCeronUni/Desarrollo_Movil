package Cincuenta_Ejercicios

fun main(paramero:Array<String>){
    println("ingrese al valor de A: ")
    var A= readln().toInt()
    println("ingrese el valor de B:")
    var B= readln().toInt()
    var SUMA= A+B
    var ELEVADO= SUMA*SUMA
    var RESULTADO:Double= ELEVADO / 3.0
    println("El resultado de (A+B)²/3 es $RESULTADO")
}