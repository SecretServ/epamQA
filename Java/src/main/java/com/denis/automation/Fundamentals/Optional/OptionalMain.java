package com.denis.automation.Fundamentals.Optional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OptionalMain {

    public static void main(String[] args) {

        String[] strArray = {"524", "3", "1844", "312", "221", "123", "88", "444", "2277", "789"};

/****   1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.  ****/
        Opt1 opt1 = new Opt1();
        opt1.shortNLong(strArray);
        System.out.println();

/****   2. Вывести числа в порядке возрастания (убывания) значений их длины.  ****/
        Opt2 opt2 = new Opt2();
        opt2.ascendingOrder(strArray);
        System.out.println();

/****   3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.  ****/
        Opt3 opt3 = new Opt3();
        opt3.averageLength(strArray);
        System.out.println();

/****   4. Найти число, в котором количество различных цифр минимально.
         * Если таких чисел несколько, найти первое из них. ****/
        Opt4 opt4 = new Opt4();
        opt4.minUniqueDigits(strArray);
        System.out.println();

/****   5. Найти количество чисел, содержащих только четные цифры,
 * а среди оставшихся — количество чисел с равным числом четных и нечетных цифр. ****/
        Opt5 opt5 = new Opt5();
        opt5.evenAndOdd(strArray);
        System.out.println();

/****   6. Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них. ****/
        Opt6 opt6 = new Opt6();
        opt6.ascendingDigits(strArray);
        System.out.println();

/****   7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них. ****/
        Opt7 opt7 = new Opt7();
        opt7.uniqueDigitsOnly(strArray);
        System.out.println();
    }
}
