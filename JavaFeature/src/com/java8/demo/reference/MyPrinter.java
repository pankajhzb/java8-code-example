package com.java8.demo.reference;

public class MyPrinter {
    public void print(String str, Parser p) {
        str=p.parse(str);
        System.out.println(str);
    }

}
