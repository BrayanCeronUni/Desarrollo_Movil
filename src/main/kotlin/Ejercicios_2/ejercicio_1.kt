package Ejercicios_2

fun main(){
println("Ingrese un número: ")
var n = readLine()!!.toInt()
var suma = 0
var i = 1
for (i in 1..n) {
    if (n % i == 0){
        suma += i}}
suma -= n
if(suma == n) {
    print("El número $n ES prerfecto")}
else {print("El número $n NO es perfecto")
}
}