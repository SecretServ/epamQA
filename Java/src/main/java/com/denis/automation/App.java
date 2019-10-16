package com.denis.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        String[] strArray = {"524", "3", "1844", "312", "221", "123", "88", "444", "2277", "789"};
        int[] intArray = {524, 3, 1844, 312, 221, 123, 88, 444, 2277, 789};
        int size = strArray.length;
        int result = 99;

        Object obj = new Object();
        Class clazz = obj.getClass();
        System.out.print(clazz.getSuperclass() + ", ");
        Class clazzClass = clazz.getClass();
        System.out.print(clazzClass.getSuperclass());





    }
}
