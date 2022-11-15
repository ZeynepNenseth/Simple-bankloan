package org.bank.LoanCalculator;

import static javax.swing.JOptionPane.*;

public class Calculator {
    private static final int BASEAMOUNT = 120_000;
    private static final int NUMBERMONTH = 48;

    public static boolean hasRight (int totalIncome, int incomeFourthYear) {
        if (!(totalIncome > 4 * BASEAMOUNT || incomeFourthYear > 2 * BASEAMOUNT)) {
            return false;
        }
        return true;
    }

    public static int calculateMaxTotalIncome () {
        return BASEAMOUNT * 7;
    }

    public static int calculateMonthlyPayback (int totalIncome, int incomeFourthYear) {
        int averageIncome = totalIncome / 4;
        int baseIncome = averageIncome > incomeFourthYear ? averageIncome : incomeFourthYear;

        if (baseIncome < calculateMaxTotalIncome()) {
            return baseIncome / NUMBERMONTH;
        } else {
            return calculateMaxTotalIncome() / NUMBERMONTH;
        }
    }

    public static void getMonthlyPayback (int incomeFourthYear, int incomeThirdYear, int incomeSecondYear, int incomeFirstYear) {
        int monthlyPayback = 0;
        int totalIncome = incomeFourthYear + incomeThirdYear + incomeSecondYear + incomeFirstYear;

        if (!hasRight(totalIncome, incomeFourthYear)) {
            showMessageDialog(null, "Du har ikke rett til banklån.");
        } else {
            monthlyPayback = calculateMonthlyPayback(totalIncome, incomeFourthYear);
            showMessageDialog(null, "Du har rett til banklån. Du betaler " + monthlyPayback + " NOK per måned.");
        }
    }
}
