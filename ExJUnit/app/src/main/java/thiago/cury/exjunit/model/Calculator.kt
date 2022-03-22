package thiago.cury.exjunit.model

/**
 * @since 21/03/2022
 * @author Thiago Cury
 */
class Calculator(var number1: Double, var number2: Double) {

    var word: String = ""

    fun sum(): Double {
        return number1 + number2
    }

    /**
     * @return adsfasdfasdfl
     */
    fun subtract(): Double {
        return number1 - number2
    }

    /**
     * @return adsfasdfasdfl
     */
    fun divide(): Double {
        return number1 / number2
    }

    /**
     * @return adsfasdfasdfl
     */
    fun multiply(): Double {
        return number1 * number2
    }

    /**
     * @return aaehfuaehfuafhu
     */
    fun checkAge(): String {
        return if(number1 >= 18) {
            "Maior de idade"
        } else {
            "Menor de idade"
        }
    }

    fun checkWord(): Int {
        return when(word) {
            "um" -> 1
            "dois" -> 2
            "três" -> 3
            "quatro" -> 4
            else -> 0
        }
    }

    /**
     * @return adsfasdfasdfl
     */
    override fun toString(): String {
        return "Numero 1: $number1 \n Numero 2: $number2 \n soma: ${sum()}"
    }
}