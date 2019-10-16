package com.denis.automation.Fundamentals.Optional;

import java.util.Arrays;

public class Opt6 {

        public void ascendingDigits(String[] array) {

            System.out.println("TASK#6: Найти число, цифры в котором идут " +
                "в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");

            int size = array.length;
            int result = 99;
            if (size > 1) {

                for (int i = 0; i < size; i++) {


                    String str = array[i];
                    if (str.length() > 1) {
                        String[] arr = str.split("");
                        Arrays.sort(arr);

                        StringBuffer sb = new StringBuffer();
                        String strSorted = "";

                        for (String value : arr) {
                            sb.append(value);
                        }

                        strSorted = sb.toString();
                        result = str.compareTo(strSorted);

                        if (result == 0) {
                            System.out.println("Number with ascending order digits is: " + array[i]);
                            break;
                        }
                    }
                }

                if (result != 0) {
                    System.out.println("Number with ascending order digits not found");
                }

            }

        }

}
