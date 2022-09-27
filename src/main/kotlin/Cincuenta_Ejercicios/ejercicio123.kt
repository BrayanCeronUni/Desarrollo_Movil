package Cincuenta_Ejercicios

fun main() {
    println("duración de la llamada")
    var tiempo= readln().toInt()
    var total=0
    if (tiempo<=3){
        total=150
        println("$total Bs")}
    else
        if (tiempo>3 && tiempo<5){
            total= 150+50
            print("$total Bs")
        }
        else{
            total=150+50+(tiempo-5)*30
            println("$total Bs")}
}