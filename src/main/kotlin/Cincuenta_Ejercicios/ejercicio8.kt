package Cincuenta_Ejercicios
fun main(paramero:Array<String>) {
    println("nombre del dinosaurio: ")
    var NOMBRE_DINOSAURIO = readln().toString()
    println("peso: ")
    var PESO_Kg= readln().toDouble()
    println("longitud: ")
    var LONGITUD_mt= readln().toDouble()
    var PESO_TON= PESO_Kg/1000
    var LONGITUD_PIES:Double = LONGITUD_mt * 0.3047
    println("$NOMBRE_DINOSAURIO")
    println("Peso en toneladas $PESO_TON")
    println("Longitud en metros $LONGITUD_PIES")
}