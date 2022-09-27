package Cincuenta_Ejercicios
fun main() {
    var x = 1
    var suma = 0
    while (x <= 10) {
        print("Ingrese el sueldo del trabajador:")
        val SUELDO=readln().toInt()
        suma += SUELDO
        x += 1
    }
    println("El total de nomina es $suma")
}