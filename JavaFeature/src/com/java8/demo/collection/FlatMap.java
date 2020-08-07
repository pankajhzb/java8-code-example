package com.java8.demo.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * In Java 8, Stream can hold different data types, for examples:
 * Stream<String[]> Stream<Set<String>> Stream<List<String>>
 * Stream<List<Object>>
 * 
 * But, the Stream operations (filter, sum, distinct…) and collectors do not
 * support it, so, we need flatMap() to do the following conversion :
 * Stream<String[]> -> flatMap -> Stream<String> Stream<Set<String>> -> flatMap
 * -> Stream<String> Stream<List<String>> -> flatMap -> Stream<String>
 * Stream<List<Object>> -> flatMap -> Stream<Object>
 * 
 * How flatMap() works :
 * 
 * { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
 * 
 * { {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
 * 
 * 1. Stream + String[] + flatMap 1.1 The below example will print an empty
 * result, because filter() has no idea how to filter a stream of String[].
 * 
 * 
 */
public class FlatMap {

	public static void main(String[] args) {

		// 1.1
		String[][] data = new String[][] { { "a", "b" }, { "a", "d" }, { "e", "a" } };
		Stream<String[]> streamData = Arrays.stream(data);
		// map
		Stream<Object> streamMap = streamData.map(x -> Arrays.stream(x));
		Stream<Object> streamFilter = streamMap.filter(x -> x.equals("a"));
		System.out.println("__MAP ___Array of String");
		streamFilter.forEach(System.out::println); // print nothing
		System.out.println("__MAP ___Array of String  -  print nothing");

		// flatmap
		Stream<String[]> streamData2 = Arrays.stream(data);
		Stream<String> streamFlat = streamData2.flatMap(x -> Arrays.stream(x));
		Stream<String> streamFilterFlat = streamFlat.filter(x -> x.equals("a"));
		System.out.println("__FLATMAP ___Array of String");
		streamFilterFlat.forEach(System.out::println);

		// 2
		List<List<String>> listOfList = Arrays.asList(Arrays.asList("one:one"),
				Arrays.asList("two:one", "two:two", "two:three", "three:one"),
				Arrays.asList("three:one", "three:two", "three:three", "three:four"));

		// map
		List<Stream<String>> mapList = mapListOfListsStream(listOfList);
		System.out.println("__MAP ___List Of List");
		mapList.forEach(System.out::println);

		// flatmap
		List<String> flattenList = flattenListOfListsStream(listOfList);
		System.out.println("__FLAT MAP ___List Of List");
		flattenList.forEach(System.out::println);

	}
	
	// using Map
	public static List<Stream<String>> mapListOfListsStream(List<List<String>> listOfList) {
		// using map
		return listOfList.stream().map(Collection::stream).filter(x -> x.equals("three:one")).collect(Collectors.toList());
	}

	// using flatMap
	public static List<String> flattenListOfListsStream(List<List<String>> listOfList) {
		// using flatMap
		return listOfList.stream().flatMap(Collection::stream).filter(x -> x.equals("three:one")).collect(Collectors.toList());
	}
}