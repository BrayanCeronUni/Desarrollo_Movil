package Cincuenta_Ejercicios
fun main() {
    var suma = 0
    for (i in 1..10) {
        print("Ingrese el sueldo del trabajador $i:")
        val SUELDO = readln().toInt()
        suma += SUELDO
    }
    println("El total de nomina es $suma")
}