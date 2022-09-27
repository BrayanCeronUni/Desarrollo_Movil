package Cincuenta_Ejercicios

fun main() {
    println("distancia a recorrer en kilometros: ")
    var dist= readln().toInt()
    println("dias de estancia: ")
    var dias= readln().toInt()
    var precio:Double= dist*0.75
    if (dist>800 && dias>7){
        var total=precio*30/100
        println("el valor de su pasaje es $total Bs")
    }
    else
        println("el valor de su pasaje es $precio Bs")
}