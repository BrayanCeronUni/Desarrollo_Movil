package Cincuenta_Ejercicios

fun main(){
    print("ingrese un numero: ")
    val numero1 = readln().toInt()
    print("ingrese un numero: ")
    val numero2= readln().toInt()
    print("ingrese un numero: ")
    val numero3= readln().toInt()
    print("ingrese un numero")
    val numero4= readln().toInt()
    when{
        numero1>numero2 && numero1>numero3 && numero1>numero4 -> println("el numero mayor es $numero1")
        numero2>numero1 && numero2>numero3 && numero2>numero4 -> println("el numero mayor es $numero2")
        numero3>numero1 && numero3>numero2 && numero3>numero4 -> println("el numero mayor es $numero3")
        numero4>numero1 && numero4>numero2 && numero4>numero3 -> println("el numero mayor es $numero4")
    }
}