package Cincuenta_Ejercicios
fun main() {
    print("ingrese el numero de matricula: ")
    val MATRICULA= readln().toInt()
    print("ingrese NOTA 1: ")
    val N1= readln().toDouble()
    print("ingrese NOTA 2: ")
    val N2= readln().toDouble()
    print("ingrese NOTA 3: ")
    val N3= readln().toDouble()
    print("ingrese NOTA 4: ")
    val N4= readln().toDouble()
    print("ingrese NOTA 5: ")
    val N5= readln().toDouble()
    val PROMEDIO= (N1+N2+N3+N4+N5)/5
    println("matricula: $MATRICULA")
    println("promedio: $PROMEDIO")
    if (PROMEDIO>= 6)
        print("APROBÓ")
    else
        print("REPROBÓ")
}