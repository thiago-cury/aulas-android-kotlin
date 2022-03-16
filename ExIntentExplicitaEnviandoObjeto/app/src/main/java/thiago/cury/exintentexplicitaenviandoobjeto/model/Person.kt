package thiago.cury.exintentexplicitaenviandoobjeto.model

import java.io.Serializable

class Person : Serializable {

    var name: String? = null
    var age: Int? = 0
    //mais 200 atributos....

    override fun toString(): String {
        return "Nome: ${name} Idade: ${age}"
    }

}