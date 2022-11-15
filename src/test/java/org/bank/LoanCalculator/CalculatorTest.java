package org.bank.LoanCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void hasRight() {
        int baseAmount4 = 480_000;
        int baseAmount2 = 240_000;
        assertTrue(500_000 > baseAmount4);
        assertTrue(300_000 > baseAmount2);
        assertFalse(400_000 > baseAmount4);
        assertFalse(200_000 > baseAmount2);
    }

    @Test
    void calculateMaxTotalIncome() {
        int maxTotalIncome = 120_000 * 6;
        assertEquals(720_000, maxTotalIncome);
    }

    @Test
    void calculateMonthlyPayback() {
        int averageIncome = 500_000;
        int maxTotalIncome = 720_000;
        int monthlyPayback = 500_000 / 48;
        assertEquals(monthlyPayback, 10_416);
    }
}