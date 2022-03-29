package clases

class Repartidor: Empleado {
    var zona:String=""
    constructor(){}
    constructor(nombreR:String,edadR:Int,salarioR:Int,zonaR:String){
        super.nombre=nombreR
        super.edad=edadR
        super.salario=salarioR
        this.zona=zonaR
    }
    override fun plus():Boolean{
        if (this.edad<25 && this.zona=="zona 3"){
            salario+=plus
            return true
        }
        return false
    }
}