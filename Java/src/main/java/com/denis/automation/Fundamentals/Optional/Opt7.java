package com.denis.automation.Fundamentals.Optional;

public class Opt7 {

    public void uniqueDigitsOnly(String[] array) {

        System.out.println("TASK#7: Найти число, состоящее только из различных цифр. " +
                "Если таких чисел несколько, найти первое из них.");

        int size = array.length;
        int digitsCount = 0;

        for (int i = 0; i < size; i++) {
            int uniqueDigitsCount = 0;
            String str = array[i];

            int stringLength = str.length();
            if (stringLength > 1) {
                for (int j = 0; j < stringLength; j++) {
                    char ch = str.charAt(j);
                    if (ch != '&') {
                        str = str.replace(ch, '&');
                        uniqueDigitsCount++;
                    }
                }
                if (uniqueDigitsCount == stringLength) {
                    System.out.println("Unique digits number is " + array[i]);
                    break;
                }
            }
        }
    }
}
