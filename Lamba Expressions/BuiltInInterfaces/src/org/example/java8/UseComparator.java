package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
	
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
 
		//Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");
		for(String str: strings){
			System.out.println(str);
		}
		
		// Case-insensitive sort with an anonymous class
		/*The sort method in Collections interface two arguments
		1. The collection.. Which is the object "strings" in our case
		2. The comparator object
		*/
		
		// Now, let's create our comparator using the lambda expression 
		
		//1. Set the generic type to string ... Comparator<String>
		//2. The compare method takes 2 arguments. We'll call them str1 and str2
		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		
		/*The second argument to the sort method will be our comparator
		Instead of declaring the anonymous object (as seen in the implementation we replaced),
		the comp object is declared outside using a lambda expression and passed here as an argument.*/
		
		Collections.sort(strings, comp);
		
		/*This implementation just replaces the piece of code that you see below
		There is no performance gain. The underlying functionality is still the same.
		This results in a case-insensitive, purely alphabetical sort operation. 
		The code is just simpler, concise and easier to read.
		*/
		
		
		//This is our previous implementation which we replaced with the Java 8 Lambda implementation.
		/*Collections.sort(strings, new Comparator<String>() {
			@Override
			public compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});*/
		System.out.println("Sort with comparator");
		for(String str: strings){
			System.out.println(str);
		}
		
	}
	
}
