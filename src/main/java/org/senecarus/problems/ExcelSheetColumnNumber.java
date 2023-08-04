package org.senecarus.problems;

public class ExcelSheetColumnNumber {



    public static int titleToNumber(String columnTitle) {

        int number = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            number = number * 26 + Character.getNumericValue(columnTitle.charAt(i)) - 9;
        }

        return number;
    }
}
