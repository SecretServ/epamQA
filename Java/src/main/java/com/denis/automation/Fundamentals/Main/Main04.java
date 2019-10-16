package com.denis.automation.Fundamentals.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
* и вывести результат на консоль.
* */

public class Main04 {

    public static void main(String[] args) throws IOException {
        int result = 0;
        int numberReader = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please, enter the quantity of numbers: ");
        int value = Integer.parseInt(reader.readLine());

        for (int i = value; i > 0; i--) {
            System.out.print("Please, enter natural number: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            numberReader = Integer.parseInt(br.readLine());
            result += numberReader;
            if (i > 1) {
                System.out.println("Result is: " + result + " " + " numbers left: " + (i - 1));
            } else {
                System.out.println("Final result is: " + result);
                br.close();
            }
        }
        reader.close();
    }

}
