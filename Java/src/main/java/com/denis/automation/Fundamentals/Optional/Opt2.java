package com.denis.automation.Fundamentals.Optional;

public class Opt2 {

    public void ascendingOrder(String[] array) {

        System.out.println("TASK #2: Вывести числа в порядке возрастания (убывания) значений их длины.");

        int size = array.length;
        int temp = 0;
        int[] intArray = new int[size];
            for (int i = 0; i < size; i++) {
                intArray[i] = Integer.parseInt(array[i]);
            }

            for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

            for (int value : intArray) {
            System.out.println(value);
        }
        }

}
