package thiago.cury.exnumero.model

class MyNumber {

    var number: Int = 0

    fun checkAAWithWhen(): String {
        return when(number) {
            0 -> "é zero"
            1 -> "é um"
            else -> "nao é nem zero nem um"
        }
    }

    fun checkAAWithWhen1(): String {
        return when(number) {
            in 0..10 -> "é de zero a dez"
            in 11..19 -> "é de onze a dezenove"
            in 20..30 -> "é de 20 a trinta"
            else -> "nao é nem zero nem um"
        }
    }

    fun checkAAWithIf1(): String {
        return if(number in 0..10) {
            "é de zero a dez"
        } else if(number in 11..19) {
            "é de onze a dezenove"
        } else if(number in 20..30) {
            "é de 20 a trinta"
        } else {
            "nao é nem zero nem um"
        }
    }

    fun checkPositiveNumber(): String {
        if(number > 0) {
            return "positivo"
        } else if(number < 0) {
            return "negativo"
        } else {
            return "neutro"
        }
    }

    fun calculateDoubleValue(): Int {
        return number * 2
    }

    fun checkEvenOdd(): String {
       if(number % 2 == 0) {
           return "é par"
       } else {
           return "é ímpar"
       }
    }

    override fun toString(): String {
        return "numero = $number\n" +
                "positivo/negativo = ${checkPositiveNumber()}\n" +
                "dobro do valor = ${calculateDoubleValue()}\n" +
                "par/impar = ${checkEvenOdd()}"
    }

}