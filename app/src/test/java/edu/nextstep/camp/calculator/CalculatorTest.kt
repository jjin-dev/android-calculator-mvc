package edu.nextstep.camp.calculator

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test


class CalculatorTest : TestCase() {
    private var calculator: Calculator? = null

    @Before
    override fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testCalculatePlus() {
        val formula = "6 + 2"

        assertEquals(8, calculator?.calculate(formula))
    }

    @Test
    fun testCalculateMinus() {
        val formula = "6 - 2"

        assertEquals(4, calculator?.calculate(formula))
    }

    @Test
    fun testCalculateMultiply() {
        val formula = "6 * 2"

        assertEquals(12, calculator?.calculate(formula))
    }

    @Test
    fun testCalculateDivide() {
        val formula = "6 / 2"

        assertEquals(3, calculator?.calculate(formula))
    }

    @Test
    fun testCalculateAll() {
        val formula = "2 + 3 * 4 / 2"

        assertEquals(10, calculator?.calculate(formula))
    }
}