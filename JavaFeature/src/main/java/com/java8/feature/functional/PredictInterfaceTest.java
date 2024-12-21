package com.java8.feature.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictInterfaceTest {

    public static void main(String[] args) {
        System.out.println("Printing Even Employee Ids");
        List<Integer> lstEmpIds = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25);
        evaluate(lstEmpIds, (n) -> n % 2 == 0);
        System.out.println("Printing Odd Employee Ids");
        evaluate(lstEmpIds, (n) -> n % 2 == 1);
        System.out.println("Printing Employee Ids less than 15");
        evaluate(lstEmpIds, (n) -> n < 15);
    }

    @SuppressWarnings("unlikely-arg-type")
    public static void evaluate(List<Integer> listEmpId, Predicate<Integer> predicateArg) {
        for (int empId : listEmpId) {
            if (predicateArg.test(empId)) // predicate method - test
                System.out.print("predicateArg.test," + empId);

            if (predicateArg.equals(empId)) // predicate method - equals
                System.out.print("predicateArg.equals," + empId);

            if (predicateArg.negate() != null) // predicate method - negate
                System.out.print("predicateArg.negate," + empId);

            //if (predicateArg.or((n) -> n < 25) != null) // predicate method - or
            //System.out.print("," +empId);
        }
    }
}
