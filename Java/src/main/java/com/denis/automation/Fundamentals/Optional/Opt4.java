package com.denis.automation.Fundamentals.Optional;

public class Opt4 {

    public void minUniqueDigits(String[] strArray) {

        System.out.println("TASK#4: Найти число, в котором количество различных цифр минимально. " +
                "Если таких чисел несколько, найти первое из них.");

        int index = 0;
        int minDigitsCount = 999;
        int size = strArray.length;

        for (int i = 0; i < size; i++) {
            int uniqueDigitsCount = 0;
            String str = strArray[i];

            int initialStringLength = str.length();
            for (int j = 0; j < initialStringLength; j++) {
                char ch = str.charAt(j);
                if (ch != '&') {
                    str = str.replace(ch, '&');
                    uniqueDigitsCount++;
                }
            }
            if (uniqueDigitsCount < minDigitsCount) {
                minDigitsCount = uniqueDigitsCount;
                index = i;
            }
        }
        System.out.println("Number with minimal unique digits is " + strArray[index]);
    }
}
