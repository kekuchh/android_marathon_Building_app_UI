package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTestCases {

    @Test
    fun calculate_tip_33_percent_wit_roundup() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(33)
        val actualTip = calculateTip(amount = 99.0, tipPercent = 33.0, true)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate_tip_33_percent_without_roundup() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(32.67)
        val actualTip = calculateTip(amount = 99.0, tipPercent = 33.0, false)
        assertEquals(expectedTip, actualTip)
    }
}
