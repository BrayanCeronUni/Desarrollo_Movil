package Cincuenta_Ejercicios

fun main() {
    println("ingrese un numero: ")
    var N1= readln().toInt()
    println("ingrese un numero: ")
    var N2= readln().toInt()
    println("ingrese un numero: ")
    var N3= readln().toInt()
    if (N1 < N2 && N1 > N3){
        println("el numero central es $N1")
    }
    else
        if (N2<N1&&N2>N3){
            println("el numero central es $N2")
        }
        else
            println("el numero central es $N3")
    }