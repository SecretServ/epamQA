package com.denis.automation.Fundamentals.Optional;

public class Opt3 {

    public void averageLength(String[] strArray) {

        System.out.println("TASK #3: Вывести на консоль те числа, длина которых меньше (больше) " +
                "средней длины по всем числам, а также длину");

        int size = strArray.length;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < size; i++) {
            sum += strArray[i].length();
        }

        average = (int) (sum / (size - 1));
        System.out.println("Average length is: " + average);

        for (int i = 0; i < size; i++) {
            if (strArray[i].length() < average) {
                System.out.println("Number: " + strArray[i] + " and length is: " + strArray[i].length());
            }
        }
    }
}
