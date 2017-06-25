package org.example.java8;

/*
 * There are many ways that we could use to traverse collections
 * 1. We could use the for each loop
 * 2. We could use the Iterator
 * 3. Or, now, from Java 8, we could use the "forEach" method
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
 
		Collections.sort(strings);
		
		
		//  Section 1 : Simple sort
		System.out.println("Simple sort");

		// Using forEach loop ***************** 1.. Traverse with for:each
		/*for(String str: strings){
			System.out.println(str);
		}*/
		
		
		// Using the new forEach method with a lambda expression***** 3.. Traverse with forEach Method
		strings.forEach(str -> System.out.println(str));
		
		
		
		
		
		// Section 2 : Comparator based sort
		
		// Here is our comparator.. The explanation for this code is available in the UseComparator class.
		Comparator<String> comp = (str1, str2) ->
		{
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings, comp);
		
		System.out.println("Sort with comparator");

		// Using Iterators ******************** 2..Traverse with iterator
		/*Iterator<String> i = strings.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}*/
		
		strings.forEach(str -> System.out.println(str));
	}
}
