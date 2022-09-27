package Ejercicios_1

fun main(){
    println("ingrese el tamaño de X: ")
    var n= readln().toInt()
    var x="X"
    var r="_"
    var c=n
    if(n==0){
        println("Error......")
    }else{
        for (i in 1..n){
            for (j in 1..n){
                when{
                    j==i || j==c-> print("$x")
                    j!=i -> print("$r")
                }
            }
            println("")
            c--
        } } }