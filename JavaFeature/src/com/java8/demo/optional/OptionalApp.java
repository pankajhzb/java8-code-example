package com.java8.demo.optional;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class OptionalApp {

	public static void main(String[] args) {

		User[] userArray = { new User(1, "pranjal", Arrays.asList("123", "456")),
				new User(1, "aaisha", Arrays.asList("12344", "45656")),
				new User(2, "beena", Arrays.asList("12233443", "477756")),
				new User(3, "pankaj", Arrays.asList("124623", "459876")),
				new User(4, "rahul", Arrays.asList("1239635", "459868996")),
				new User(2, "pankaj", Arrays.asList("12776783", "4598799786")) };

		List<User> users = Arrays.asList(new User(1, "pranjal", Arrays.asList("123", "456")),
				new User(1, "aaisha", Arrays.asList("12344", "45656")),
				new User(1, "beena", Arrays.asList("12233443", "477756")),
				new User(1, "PANKAJ", Arrays.asList("124623", "459876")),
				new User(1, "rahul", Arrays.asList("1239635", "459868996")),
				new User(1, "sweta", Arrays.asList("12776783", "4598799786")));

		String[] array = { "pranjal", "aaisha", "pankaj", "rahul", "pranjal" };
		IntSummaryStatistics intSummary = IntStream.of(1, 2, 3, 10, 45, 67, 112, 890, 22, 11, 1).summaryStatistics();
		System.out.println(intSummary);
		// 1
		Arrays.stream(array).filter(x -> x.startsWith("p")).sorted().forEach(System.out::println);

		Arrays.stream(array).filter(x -> x.startsWith("p")).map(String::toUpperCase).sorted()
				.forEach(System.out::println);

	}

}
