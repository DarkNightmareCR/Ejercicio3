package clases

abstract class Empleado {
    var nombre:String=""
    var	edad:Int=0
    var	salario:Int=0
    val plus:Int=300
    abstract fun plus():Boolean
}