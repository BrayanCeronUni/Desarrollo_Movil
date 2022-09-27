package Cincuenta_Ejercicios

fun main(){
    println("SALARIO Y RETENCION")
    println("SALARIO: ")
    val SALARIO:Double= readln().toDouble()
    if (SALARIO< 1500) {
        println("Retencion 0%")
        print("Salario neto: $SALARIO")
    }
    else
        if (SALARIO > 1500.0 && SALARIO < 3000.0) {
            println("Retencion 5.25%")
            var Neto = SALARIO - (SALARIO * 0.0525)
            println()
            println("Salario neto: $Neto")
        }
        else{
            println("Retencion 7.45%")
            var Neto = SALARIO - (SALARIO * 0.0745)
            print("Salario neto: $Neto")
        }
}