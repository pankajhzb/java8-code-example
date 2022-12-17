package com.java8.demo.stream;

public class StreamApp {

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        double calculate = formula.calculate(100);     // 100.0
        double sqrt = formula.sqrt(16);           // 4.0

        System.out.println(calculate);
        System.out.println(sqrt);

        Formula formulaRef = (x) -> {
            System.out.println("value :" + x);
            return x;
        };
        formulaRef.calculate(10);

    }
}
