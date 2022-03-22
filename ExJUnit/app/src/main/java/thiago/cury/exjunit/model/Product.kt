package thiago.cury.exjunit.model

/**
 * @author Thiago Cury
 * @since 21/03/2022
 */
class Product {

    var description: String = ""
    var price: Double = 0.0
    var amount: Int = 0

    /**
     * @return ahfuaehfuaehfu
     */
    fun calculateTotal(): Double {
        return price * amount
    }

}