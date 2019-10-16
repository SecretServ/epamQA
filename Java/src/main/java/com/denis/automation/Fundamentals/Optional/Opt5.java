package com.denis.automation.Fundamentals.Optional;

public class Opt5 {

    public void evenAndOdd(String[] array) {

        System.out.println("TASK#5: Найти количество чисел, содержащих только четные цифры, " +
                "а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.");

        int size = array.length;
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }


        int finalEvenCounter = 0;
        int finalOddCounter = 0;

        for (int i = 0; i < size; i++) {
            int tempEvenCounter = 0;
            int tempOddCounter = 0;
            int tempValue = intArray[i];
            int lastDigit = 0;

            while (tempValue > 0) {
                lastDigit = tempValue % 10;
                if (lastDigit % 2 == 0) {
                    tempEvenCounter++;
                } else {
                    tempOddCounter++;
                }
                tempValue /= 10;
            }
            if (tempEvenCounter != 0 && tempOddCounter == 0) {
                finalEvenCounter++;
            } else if (tempEvenCounter > 0 && tempEvenCounter == tempOddCounter) {
                finalOddCounter++;
            }
        }

        System.out.println(finalEvenCounter + " numbers with all even digits");
        System.out.println(finalOddCounter + " numbers with equal even and odd digits");
    }
}
