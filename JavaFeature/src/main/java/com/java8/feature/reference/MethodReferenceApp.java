package com.java8.feature.reference;

class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferenceApp {

    public static void main(String[] args) {
        Calc.addSomething(10, 20);
        // 1. Reference to a static method
        Calculator calcRef = Calc::addSomething;
        calcRef.add(11, 22);

        // 2. Reference to a non static method.
        Calc calc = new Calc();
        Calculator calcRef2 = calc::letsAddSomething;
        calcRef2.add(22, 22);
    }

    interface Calculator {
        void add(int num1, int num2);
    }

    static class Calc {
        public static void addSomething(int num1, int num2) {
            System.out.println(num1 + "and" + num2 + "addition is: " + (num1 + num2));
        }

        public void letsAddSomething(int num1, int num2) {
            System.out.println(num1 + "and" + num2 + "addition is: " + (num1 + num2));
        }
    }

}
