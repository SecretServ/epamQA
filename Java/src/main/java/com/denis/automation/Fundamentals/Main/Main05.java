package com.denis.automation.Fundamentals.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
Осуществить проверку корректности ввода чисел.
* */

public class Main05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String result;
        int month = 0;
        while ((line = br.readLine()) != null) {
            month = Integer.parseInt(line);
            switch(month) {
                case 1 : result = "January";
                    break;
                case 2 : result = "February";
                    break;
                case 3 : result = "March";
                    break;
                case 4 : result = "April";
                    break;
                case 5 : result = "May";
                    break;
                case 6 : result = "June";
                    break;
                case 7 : result = "July";
                    break;
                case 8 : result = "August";
                    break;
                case 9 : result = "September";
                    break;
                case 10 : result = "October";
                    break;
                case 11 : result = "November";
                    break;
                case 12 : result = "December";
                    break;
                default : result = "Please, enter valid number of the month";
                    break;
            }
            System.out.println(result);
        }

    }

}
