package cgg.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Raj", "Shekar", 21), new Person("Sanju", "Pottabttni", 22),
				new Person("Ajay", "Mahankali", 20), new Person("Vamshi", "Botla", 21));
		//External Iterators controlled by Programmers-Slow
		System.out.println("Iterating using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("--------------------------------------------");
		System.out.println("Itertaing using for in(for each) loop");
		for (Person person : people) {
			System.out.println(person);
		}
		//Internal Iterators - controlled by JVM possible can execute in parallel also-Fast
		System.out.println("--------------------------------------------");
		System.out.println("Iterating using Lambdas");
		people.forEach(p->System.out.println(p));
		System.out.println("--------------------------------------------");
		
		System.out.println("Iterating using method reference");
		people.forEach(System.out::println);
		System.out.println("--------------------------------------------");
		
		
	}

}