package Cincuenta_Ejercicios
fun main(paramero:Array<String>) {
    println("radio: ")
    var RADIO= readln().toDouble()
    println("altura: ")
    var ALTURA= readln().toDouble()
    var VOLUMEN= Math.PI * (RADIO * RADIO) * ALTURA
    var AREA=   2 * Math.PI * RADIO * ALTURA
    print("El area del cilindro es $AREA mts² y su volumen es de $VOLUMEN mts³")
}