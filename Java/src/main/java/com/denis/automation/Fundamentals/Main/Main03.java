package com.denis.automation.Fundamentals.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
* */

public class Main03 {

    static int rundomGenerator() {
        return (int) (Math.random() * 99);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please, enter the quantity of numbers: ");
        int value = Integer.parseInt(reader.readLine());

        for (int i = 0; i < value; i++) {
            System.out.println(rundomGenerator());
        }

        for (int i = 0; i < value; i++) {
            System.out.print(rundomGenerator() + " ");
        }


    }

}
