package Cincuenta_Ejercicios

fun main(){
    println("calculos de triangulo")
    print("ingrese el valor de la base: ")
    val base= readln().toInt()
    print("ingrese valor de la altura: ")
    val alttura= readLine()!!.toInt()

    var superficie:Double= (base*alttura)/2.0
    println("la superficie del triangulo es $superficie cm²")

    println()
    println("calculos del circulo")
    print("ingrese valor del radio: ")
    val radio= readLine()!!.toInt()

    val area: Double= Math.PI * Math.pow(radio.toDouble(),2.0)
    println("el area del circulo es $area cm²")
}