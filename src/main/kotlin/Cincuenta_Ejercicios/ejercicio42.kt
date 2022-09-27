package Cincuenta_Ejercicios

fun main(){
    println("numero de tabla: ")
    var tabla= readln().toInt()
    var x=1
    for (i in 1..10){
        var n1=tabla * x
        println("$tabla*$x=$n1")
        x+=1
    }
}