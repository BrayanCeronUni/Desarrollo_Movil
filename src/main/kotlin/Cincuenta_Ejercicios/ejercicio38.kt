package Cincuenta_Ejercicios

fun main(){
    print("ingrese un numero: ")
    var num = readln().toInt()
    if (num>4){
    for (i in 4..num){
        var mult=4*i
        println(mult)
    }}
}