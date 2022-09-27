package Cincuenta_Ejercicios

fun main(){
    var x=1
    var num=0.0
    var spar=0.0
    var cont_par=0.0
    var cont_imp=1.0
    var simp=0.0
    var media=0.0
    while (x<=10){
        println("inserte un numero: ")
        num=readln().toDouble()
        if (num%2==0.0){
            spar+=num
            cont_par++
        }
        else{
            simp+=num
            cont_imp+1
            media=simp/cont_imp
        }
        x=x + 1
    }
    println("suma de los numeros pares: $spar")
    println("conteo de pares: $cont_par")
    println("media aritmetica de impares: $media")
}