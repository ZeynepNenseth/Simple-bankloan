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
        int incomeFourthYear = stateIncome(currentYear - 1);
        int incomeThirdYear = stateIncome(currentYear - 2);
        int incomeSecondYear = stateIncome(currentYear - 3);
        int incomeFirstYear = stateIncome(currentYear - 4);

        Calculator.getMonthlyPayback (incomeFourthYear ,incomeThirdYear, incomeSecondYear, incomeFirstYear);
    }

    public static void main(String[] args) {
        userInteraction();
    }
}