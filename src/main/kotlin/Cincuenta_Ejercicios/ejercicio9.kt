package Cincuenta_Ejercicios
fun main(paramero:Array<String>) {
    println("galones: ")
    var GALON= readln().toDouble()
    var LITRO= GALON * 3.785
    var PRECIO_LITRO= LITRO * 4.50
    println("Galones $GALON")
    println("Litros $LITRO")
    println("Precio por litro $4.50")
    println("Precio Total de esta Venta $$PRECIO_LITRO")
}