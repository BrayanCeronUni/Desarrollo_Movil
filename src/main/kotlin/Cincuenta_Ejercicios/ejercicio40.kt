package Cincuenta_Ejercicios

fun main(){
    println("ingrese el valor de A: ")
    val A= readln().toInt()
    println("ingrese el valor de B: ")
    val B= readln().toInt()
    var Xi=0
    if (Math.pow(A.toDouble(),2.0)-Math.pow(B.toDouble(),2.0)>0 ) {
        var Xi = A + B
        println("Xi=$Xi")
    }
    else {
        if (Math.pow(A.toDouble(),2.0)-Math.pow(B.toDouble(),2.0)==0.0 ) {
            var Xi = A-2*B
            println("Xi=$Xi")
        }else{
            var Xi = A+B-5
            println("Xi=$Xi")
        }
    }
}