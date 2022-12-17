package org.bank.LoanCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void hasRight() {
        assertTrue(Calculator.hasRight(800_000, 350_000));
        assertTrue(Calculator.hasRight(800_000, 100_000));
        assertFalse(Calculator.hasRight(200_000, 200_000));
        assertFalse(Calculator.hasRight(-500_000, 200_000));
        assertTrue(Calculator.hasRight(800_000, -100_000));
        assertFalse(Calculator.hasRight(200_000, -350_000));
        assertFalse(Calculator.hasRight(0, -350_000));
    }

    @Test
    void calculateMaxTotalIncome() {
        assertEquals(120_000 * 7, Calculator.calculateMaxTotalIncome());
    }

    @Test
    void calculateMonthlyPayback() {
        assertEquals(350_000 / 48, Calculator.calculateMonthlyPayback(800_000, 350_000));
        assertEquals(200_000 / 48, Calculator.calculateMonthlyPayback(800_000, -350_000));
        assertEquals(350_000 / 48, Calculator.calculateMonthlyPayback(0, 350_000));
        assertEquals(200_000 / 48, Calculator.calculateMonthlyPayback(800_000, 100_000));
        assertEquals(120_000 * 7 / 48, Calculator.calculateMonthlyPayback(3_500_000, 350_000));
    }
}