package Cincuenta_Ejercicios

fun main(paramero:Array<String>) {
    print("CATEGORÍA: ")
    val CATEGORIA= readln().toInt()
    print("SUELDO: ")
    val SUELDO= readln().toInt()
    val CAT1 = SUELDO + ((SUELDO * 15) / 100)
    val CAT2 = SUELDO + ((SUELDO * 15) / 100)
    val CAT3 = SUELDO + ((SUELDO * 8) / 100)
    val CAT4 = SUELDO + ((SUELDO * 7) / 100)
    if (CATEGORIA == 1) {
        print("Sueldo total: $$CAT1")}
    else
        if (CATEGORIA ==2)
            print("Sueldo total: $$CAT2")
        else
            if (CATEGORIA == 3)
                print("Sueldo total: $$CAT3")
            else
                if (CATEGORIA == 4)
                print("Sueldo total: $$CAT4")
                else
                    println("Error......")
}