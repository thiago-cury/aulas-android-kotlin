package thiago.cury.exentradadedadosedittext.model

class Client(var name: String) { //construtor primário

    fun convertNameToUpperCase(): String {
        return name.uppercase()
    }

    fun convertNameToLowerCase(): String {
        return name.lowercase()
    }

    override fun toString(): String {
        return "O seu nome é $name"
    }
}

//class Client {
//
//    var name: String? = null
//
//    fun convertNameToUpperCase(): String? {
//        return name?.uppercase()
//    }
//
//    fun convertNameToLowerCase(): String? {
//        return name?.lowercase()
//    }
//
//    override fun toString(): String {
//        return "O seu nome é $name"
//    }
//}