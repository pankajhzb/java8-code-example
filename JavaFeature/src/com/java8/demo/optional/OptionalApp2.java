package com.java8.demo.optional;
/*
 * In approaches like ours, there is no clear demarcation between null checks and business logic. And it would be convenient if null checks could be decoupled from the business logic.

		For this, Java 8 gives us the Optional class.

		The Optional class, present in the java.util package, represents a container that may hold null or non-null values.
		It provides a number of methods to perform null check without polluting the code.
		
		Problem Statement:
		BestSol company has a requirement to fetch the project code of its employees and append the same with the string “bestSol”.

		There are possibilities that some employees are not allocated to any project and have no project code associated with them.

		Provide a solution for this requirement with possible null checks.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalApp2 {

	public static void main(String[] args) {

		// Providing optional passport object to the Optional class
		Optional<Passport> p1 = Optional.of(new Passport(10121));

		// constructing employee object
		// Employee e1 = new Employee("Robert",102,10000D,p1);

		// Optional<Passport> p2 =Optional.of(new Passport(10122));
		// Employee e2 = new Employee("James",105,15000D,p2);

		// to get the employee list
		// List<Employee> employeesList = Employee.getEmployeeList();
		// List<Integer> passportNumbers = new ArrayList<>();
		// List to collect the passport numbers
		/*
		 * for (Employee employee : employeesList) {
		 * passportNumbers.add(employee.getPassport().orElse(new
		 * Passport(0)).getPassportNo()); } passportNumbers.forEach(x ->
		 * System.out.println("Passport number: " + x));
		 */
	}

}
