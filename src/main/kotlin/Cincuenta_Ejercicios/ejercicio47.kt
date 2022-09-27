package Cincuenta_Ejercicios

fun main() {
    print("dia: ")
    var dia= readln().toInt()
    print("mes: ")
    var mes= readln().toInt()
    print("año: ")
    var año= readln().toInt()
    if (dia == 28 && mes ==2 && año %4==0 && año%400==0){
        dia+=1
        mes +=1
        println(dia)
        println(mes)
        println(año)
    }
}