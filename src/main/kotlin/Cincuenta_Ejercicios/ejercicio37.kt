package Cincuenta_Ejercicios

fun main(){
    print("producto: ")
    val producto = readln()
    print("precio: ")
    val precio= readln().toDouble()
    print("cantidad: ")
    val cantidad = readln().toDouble()
    val costo = precio * cantidad
        costo+(costo * 12 / 100)
    if (costo > 100){
        val pb7=costo-(costo*7/100)
        println("costo bruto con descuento del 7%: $pb7 ")
    }
    else{
        println("precio bruto : $costo")
    }
}