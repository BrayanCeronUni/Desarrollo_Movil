package Cincuenta_Ejercicios

fun main(){
    print("ingrese un numero: ")
    val numero1 = readln().toInt()
    if (numero1%2==0 && numero1 !=2){
        println("el numero $numero1 no es primo")
    }
    else{
        if (numero1%3==0 && numero1 !=3){
            println("el numero $numero1 no es primo")
        }
        else{
            println("el numero $numero1 es primo")
        }
    }
}