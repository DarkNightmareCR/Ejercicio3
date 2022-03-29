package clases

class Comercial: Empleado {
    var comision:Double=0.0
    constructor(){}

    constructor(nombreC:String,edadC:Int,salarioC:Int,comisionC:Double){
        super.nombre=nombreC
        super.edad  =edadC
        super.salario=salarioC
        this.comision=comisionC
    }

    override fun plus():Boolean {
        if (super.edad>30 && this.comision>200){
            salario+=plus
            return true
        }
        return false
    }
}