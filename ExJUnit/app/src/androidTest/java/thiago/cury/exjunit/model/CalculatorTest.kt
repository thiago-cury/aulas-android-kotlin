package thiago.cury.exjunit.model

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * @since 21/03/2022
 * @author Thiago Cury
 */
class CalculatorTest {

    var calculator: Calculator = Calculator(2.0, 4.0)

    @Before
    fun setUp() {
        //ele vai rodar sempre antes de passar em cada teste
        calculator.number1 = 2.0
        calculator.number2 = 4.0
    }

    @After
    fun tearDown() {
        //o tearDown vai passar sempre depois de cada teste
    }

    @Test
    fun sum() {
        assertEquals(6.0, calculator.sum(),0.0)

        calculator.number1 = 100.0
        calculator.number2 = 100.0
        assertEquals(200.0, calculator.sum(),0.0)
    }

    @Test
    fun subtract() {
        assertEquals(-2.0, calculator.subtract(), 0.0)
    }

    @Test
    fun divide() {
        assertEquals(0.5, calculator.divide(), 0.0)
    }

    @Test
    fun multiply() {
        assertEquals(8.0, calculator.multiply(), 0.0)
    }

    @Test
    fun checkAgeMajor() {
        calculator.number1 = 20.0
        assertEquals("Maior de idade", calculator.checkAge())
    }

    @Test
    fun checkAgeMinor() {
        calculator.number1 = 10.0
        assertEquals("Menor de idade", calculator.checkAge())
    }

    @Test
    fun checkWord() {
        calculator.word = "um"
        assertEquals(1, calculator.checkWord())

        calculator.word = "dois"
        assertEquals(2, calculator.checkWord())

        calculator.word = "três"
        assertEquals(3, calculator.checkWord())

        calculator.word = "quatro"
        assertEquals(4, calculator.checkWord())

        calculator.word = "cinco"
        assertEquals(0, calculator.checkWord())

        calculator.word = "menos 10"
        assertEquals(0, calculator.checkWord())
    }

    @Test
    fun testToString() {
        assertEquals("Numero 1: 2.0 \n Numero 2: 4.0 \n soma: 6.0", calculator.toString())
    }

}