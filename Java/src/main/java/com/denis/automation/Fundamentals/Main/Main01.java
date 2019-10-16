package com.denis.automation.Fundamentals.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Main01 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter your name.");
        System.out.println("Hello, " + reader.readLine());
    }

}
