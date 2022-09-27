package Cincuenta_Ejercicios

fun main(paramero:Array<String>) {
    print("Ingrese el sueldo del empleado: $ ")
    var SUELDO= readln().toInt()
    if (SUELDO > 1000) {
        var INFERIOR = (SUELDO + ((SUELDO * 15) / 100))
        print("Su sueldo +15% es: $$INFERIOR")}
    else {
        print("Su sueldo es: $$SUELDO")}
}