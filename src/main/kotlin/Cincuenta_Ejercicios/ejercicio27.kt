package Cincuenta_Ejercicios
fun main() {
    print("Cuantos datos ingresará:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("Ingrese un dato:")
        val dato = readln().toInt()
        if (dato %10 == 0)
            cantidad = cantidad +1
        x = x + 1;
    }
    print("La cantidad de CEROS es: $cantidad")
}