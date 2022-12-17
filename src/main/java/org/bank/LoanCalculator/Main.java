package org.bank.LoanCalculator;

import java.time.Year;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    private static boolean isNumber (String income) {
        try {
            Integer.parseInt(income);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int stateIncome (int year) {
        String statedIncome = showInputDialog("Skriv inn ditt inntekt (NOK) i år " + year + ":");
        while (!isNumber(statedIncome)) {
            statedIncome = showInputDialog("Ugyldig input! \nSkriv inn ditt inntekt i år " + year + ":");
        }
        return Integer.parseInt(statedIncome);
    }

    public static void userInteraction () {
        int currentYear = Year.now().getValue();
        int incomePerYear[] = new int[4];

        for (int i = 0; i < incomePerYear.length; i++) {
            incomePerYear[i] = stateIncome(currentYear - 1 - i);
        }

        Calculator.getMonthlyPayback (incomePerYear[0] ,incomePerYear[1], incomePerYear[2], incomePerYear[3]);
    }

    public static void main(String[] args) {
        userInteraction();
    }
}