package Cincuenta_Ejercicios
import kotlin.math.sqrt
fun main(paramero:Array<String>) {
    println("lado 1: ")
    var LADO_1= readln().toDouble()
    println("lado 2:")
    var LADO_2= readln().toDouble()
    println("lado 3: ")
    var LADO_3= readln().toDouble()
       var S= (LADO_2+LADO_1+LADO_3) / 2
         var AREA= sqrt(S*(S-LADO_1)*(S-LADO_2)*(S-LADO_3))
    println("El area del triangulo es de $AREA cm²")
}