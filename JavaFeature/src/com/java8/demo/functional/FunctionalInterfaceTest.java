package com.java8.demo.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceTest {
	List<Student> listOfStudents = new ArrayList<Student>();

	List<Student> getListOfStudents() {

		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		return listOfStudents;

	}

	// Predicate, Consumer, Function and Supplier using above listOfStudents.
	// a) Predicate – Tests an object
	// Predicate represents an operation which takes an argument T and returns a
	// boolean.
	// Use this functional interface, if you want to define a lambda expression
	// which performs some test on an argument and returns true or false
	// depending upon outcome of the test.
	void testPredicate() {
		Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization()
				.equals("Mathematics");

		List<Student> mathematicsStudents = new ArrayList<Student>();

		for (Student student : listOfStudents) {
			if (mathematicsPredicate.test(student)) {
				mathematicsStudents.add(student);
			}
		}
	}

	// b) Consumer – Consumes an object
	// Consumer represents an operation which takes an argument and returns nothing.
	// Use this functional
	// interface If you want to compose a lambda expression which performs some
	// operations on an object.
	void testConsumer() {
		Consumer<Student> name = (Student student) -> {
			System.out.println("Student name:" + student.getName());
		};
		name.andThen(name);
	}

}
