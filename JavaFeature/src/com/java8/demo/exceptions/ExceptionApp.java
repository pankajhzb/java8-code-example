package com.java8.demo.exceptions;

import java.io.File;

public class ExceptionApp {
    //todo
    //try - resource
    // catch block exception handling
    // closeble interface

    public static void main(String[] ergs) {
        checkEvenNumber(5);
    }

    public static void checkEvenNumber(int i) {
        try {
            if (i % 2 == 0) {
                System.out.println("Even number.");
            } else {
                System.out.println("Odd number.");
            }

            // no need exception handling and connection close
            File f = new File("c:\test.text");
            f.exists();


    // different type of exception need to add, which parent is different
            // Using ||
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}
