package com.denis.automation.Fundamentals.Optional;

public class Opt1 {

    public void shortNLong(String[] strArray) {

        System.out.println("TASK #1: Найти самое короткое и самое длинное число. Вывести найденные числа и их длину. ");

        int size = strArray.length;

        int minLength = strArray[0].length();
        int maxLength = strArray[0].length();
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < size - 1; i++) {
            int temp = strArray[i].length();

            if (minLength > temp) {
                minLength = temp;
                minIndex = i;
            }

            if (maxLength < temp) {
                maxLength = temp;
                maxIndex = i;
            }
        }

        System.out.println("The shortest number is: " + strArray[minIndex] + ", and it's length is: " + minLength);
        System.out.println("The longest number is: " + strArray[maxIndex] + ", and it's length is: " + maxLength);

    }

}
