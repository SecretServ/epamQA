package com.denis.automation.Fundamentals.Main;

/*
Отобразить в окне консоли аргументы командной строки в обратном порядке.
*/

public class Main02 {

    public static void main(String[] args) {

        int size = args.length;
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }

    }

}
