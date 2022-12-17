package org.bank.LoanCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void hasRight() {
        assertTrue(Calculator.hasRight(800_000, 350_000));
        assertTrue(Calculator.hasRight(800_000, 100_000));
        assertFalse(Calculator.hasRight(200_000, 200_000));
    }

    @Test
    void calculateMaxTotalIncome() {
        assertEquals(120_000 * 7, Calculator.calculateMaxTotalIncome());
    }

    @Test
    void calculateMonthlyPayback() {
        assertEquals(350_000 / 48, Calculator.calculateMonthlyPayback(800_000, 350_000));
        assertEquals(200_000 / 48, Calculator.calculateMonthlyPayback(800_000, 100_000));
    }
}