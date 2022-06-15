package es.codigonline.curso.miprimeraapp.ui

class Ejercicios1 {

    /**
     *
    Declara 3 variables de tipo Int
    Declara 3 variables de tipo Double
    Declara 3 variables de tipo String
    Declara 3 variables de tipo Boolean
    Declara 3 variables de cualquier tipo que puedan ser nulas
    Muestra por pantalla todos los resultados

     */
    fun main() {
        var numero1 = 4;
        var numero2 = 5;
        var numero3 = 6;
        println("Los numeros Int son: $numero1 $numero2 $numero3")
        var double1 = 4.5
        var double2 = 6.7
        var double3 = 9.9
        println("Los numeros Double son: $double1 $double2 $double3")

        var txt1 = "Hola"
        var txt2 = ", "
        var txt3 = "Mundo"
        println("Los textos son: $txt1$txt2 $txt3")
        var bool1 = true
        var bool2 = false
        var bool3 = true
        println("Los boolean son: $bool1 $bool2 $bool3")

        var numNull:Int? =5
        var txtNull:String? = "Hola"
        var boolNull:Boolean? = null
        println("Los boolean son: $numNull $txtNull $boolNull")




    }
}