package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

	public static void main(String[] args) {
		String[] arr = { "abc", "dfe", "pqr", "lmn" };
		Stream<String> stream = Arrays.stream(arr);
		
		stream.forEach(System.out::println);
		
		System.out.println("-----------------------");
		Stream<Object> stream2 = Stream.of("a","b",2);
		
		stream2.forEach(System.out::println);
		System.out.println("-----------------------");
		
		
		List<String> s=new ArrayList<>();
		s.add("cda");
		s.add("fdf");
		s.add("lmn");
		s.add("tgd");
       
		Stream<String> stream3 = s.stream();
		
		stream3.forEach(System.out::println);
		
		List<Student> stuList=new ArrayList<Student>();
		stuList.add(new Student("vamshi",21));
		stuList.add(new Student("sanju",20));
		stuList.add(new Student("ajay",22));
		stuList.add(new Student("shiva",19));
		stuList.add(new Student("ram",25));
		stuList.add(new Student("shash",24));
		
		System.out.println("----------------------------");
		Stream<Student> stream4 = stuList.parallelStream();
		System.out.println("Student send for processing..");
		
		stream4.forEach(t->doWork(t));
		
		
		 
	}

	private static void doWork(Student t) {
		System.out.println(t);
	}
	//massive amount of data for processing going for parallelStream is a good option
	//Order of iteration of element is not maintained
	//makes use of multiple threads as well as multiCore processing
}
