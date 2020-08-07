package com.java8.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApps {

	public static void main(String[] args) {
		List<Employee> employees = Employee.getAllEmployees();

		// copy
		List<Employee> copy = new ArrayList<>(employees);
		copy.sort((o1, o2) -> (int) o1.getSalary() - (int) o2.getSalary());

		// 1
		employees.stream().limit(3).sorted().map(Employee::getName).forEach(System.out::println);
		// 2

		/*Map<String, Employee> empMap = employees.stream()
				.limit(3)
				.sorted()
				.map(Employee::getName)
				.collect(Collectors.toMap(e -> e.name, e -> e));*/
		
		// groupby dept
		Map<String, List<Employee>> empByName = employees.stream().collect(Collectors.groupingBy(e -> e.name));

		// count of employees in each dept
		Map<String, Long> deptCounts = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		
		//deptCounts.forEach(System.out::println);
		
		// 3
		String names = employees.stream().limit(3).sorted().map(Employee::getName).collect(Collectors.joining(","));
	}

}
