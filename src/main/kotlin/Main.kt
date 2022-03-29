import clases.Comercial
import clases.Repartidor
fun main(args: Array<String>) {
    val c1=Comercial("Pepe",25,20000,300.25)
    val c2=Comercial("Pedro",31,30000,201.5)
    val c3=Comercial("Gera",30,25000,250.3)
    val r1=Repartidor("Lucho",15,15000,"zona 25")
    val r2=Repartidor("Eduardo",21,20000,"zona 3")
    val r3=Repartidor("Jose",25,22000,"zona 3")
    println(c1.plus())
    println(c2.plus())
    println(c3.plus())
    println(r1.plus())
    println(r2.plus())
    println(r3.plus())
    println(c2.salario)
    println(r2.salario)
}