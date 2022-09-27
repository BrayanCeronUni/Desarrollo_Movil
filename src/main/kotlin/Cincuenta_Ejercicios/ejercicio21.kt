package Cincuenta_Ejercicios
fun main() {
    print("Inserte el valor de A: ")
    var a= readln().toInt()
    print("Inserte el valor de B: ")
    var b= readln().toInt()
    print("Inserte el valor de C: ")
    var c= readln().toInt()
    var raiz= (b*b)-4*(a*c)
    var b1= b*(-1)
    var a1= 2*a
    println("las raices son: ")
    println("la raiz 1 es $b1 + √$raiz / $a1")
    println("la raiz 2 es $b1 - √$raiz / $a1")
}