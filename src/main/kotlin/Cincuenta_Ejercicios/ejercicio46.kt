package Cincuenta_Ejercicios

fun main() {
    var edad=0
    var estado=0
    var sexo=0
    var sueldo=0
    var Smenos1000=0
    var Sentre100y250=0
    var Smas250=0
    var fem=0
    var homMas25=0
    var mujViuM1000=0
    var sumEdHOM=0
    var cantHom=0
    for (i in 1..3) {
        println("ingrese edad $i: ")
        var edad = readln().toInt()
        println("estado civil, solter@=1, casad@=2, viud@=3: ")
        var estado = readln().toInt()
        println("sexo, mujer=1, hombre=2: ")
        var sexo= readln().toInt()
        println("sueldo menor a 1000=1, entre 1000 y 2500=2, superior a 2500=3: ")
        var sueldo= readln().toInt()
        if (sueldo==1)
            Smenos1000+=1
        else
            if (sueldo==2)
                Sentre100y250+=1
            else
                Smas250+=1
        if (sexo==1)
            fem+=1
        if (sexo==2 && estado==2 && sueldo==3 )
            homMas25+=1
        if (sexo==1 && estado == 3 && sueldo>1)
            mujViuM1000+=1
        if (sexo==2)
            sumEdHOM+=edad
        cantHom+=1
    }
    var promSuelHom=sumEdHOM/cantHom
    println("total femenino: $fem")
    println("hombres casados y que ganan mas de 2500 Bs: $homMas25")
    println("mujeres viudas que ganan mas de 1000 Bs: $mujViuM1000")
    println("edad promedio de los hombres: $promSuelHom")
}