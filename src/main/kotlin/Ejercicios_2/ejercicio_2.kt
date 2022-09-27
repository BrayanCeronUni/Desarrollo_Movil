package Ejercicios_2

fun main(){
        println("ingrese un numero: ")
        var n= readln().toInt()
        var ninv=0
        var aux=n
        while (n>0){
            var b =(n%10)
            ninv=b+ninv*10
            n/=10
        }
        if (ninv== aux){
            print("el numero es capicua")
        }else{
            println("el numero  no es capicua")
        }
}
