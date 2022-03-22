package thiago.cury.exjunit.model

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class ProductTest {

    var product = Product()

    init {
        product.description = "Produto legal"
        product.amount = 10 //int
        product.price = 10.0 //double
    }

    @Before
    fun setUp() {
        product.description = "Produto legal"
        product.amount = 10 //int
        product.price = 10.0 //double
    }

    @After
    fun tearDown() {
    }

    @Test
    fun calculateTotal() {
        assertEquals(100.0, product.calculateTotal(),0.0)
    }
}