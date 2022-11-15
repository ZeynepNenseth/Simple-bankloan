package org.bank.LoanCalculator;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void stateIncome() {
        int income1 = 200_000;
        int income2 = 0;
        int income3 = 800_000;
        assertEquals(income1, 200_000);
        assertEquals(income2, 0);
        assertEquals(income3, 800_000);

    }
}