package cgg.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
//		 ExecutorService executorService = Executors.newSingleThreadExecutor();
//		 
//		 //Runnable r=()->System.out.println("My task is running............");
//		 Runnable r=MethodReferenceExample::myRun;//Class name::StaticMethodName
//		 executorService.execute(r);
		
		List<Integer>  numbers = Arrays.asList(4,9,36,100);
		numbers.forEach(System.out::println);
		System.out.println("-----------------------------------------------");
		List<Double> Snum=MethodReferenceExample.findSquareRoots(numbers, Double::new);
		Snum.forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("vamshi",21));
		persons.add(new Person("sanju",22));
		persons.add(new Person("Ajay",20));
		persons.add(new Person("Farooq",21));
		persons.add(new Person("Raj",17));
		
		List<String> names=MethodReferenceExample.getPersonName(persons,Person::getName);
		names.forEach(System.out::println);
		
		System.out.println("------------------------");
		PersonManager pm=()->new Person();
		String result=pm.getPerson().getPersonInfo();
		System.out.println(result);

	}
	private static List<String> getPersonName(List<Person> persons,Function<Person,String> f) {
		 List<String> res1=new ArrayList<String>();
		 persons.forEach(p->res1.add(f.apply(p)));
         return res1;
	}
	private static List<Double> findSquareRoots(List<Integer> numbers,Function<Integer,Double> f) {
		 List<Double> res=new ArrayList<Double>();
		 numbers.forEach( x->res.add(Math.sqrt(f.apply(x))));
		 
		 return res;
	}
	 
	//Static Method
//    private static void myRun() {
//    	System.out.println("My task is running.....");
//    }
}
