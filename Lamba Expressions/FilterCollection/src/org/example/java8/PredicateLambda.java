package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateLambda {
	
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		
		/*
		 * Implement the interface using Lambda expression
		 * We'll start with the signature of the method we are implementing, which is the method "test" here.
		 * Since we are declaring Predicate with generic type "Person", the argument (as part of the method signature)
		 * is going to be an instance of type Person, which we just name as "p".
		 * Next step is implementing our method "test".
		 * Which we do after the arrow token or the Lambda.
		 * The body of the implementaion is a simple condition to fetch all person records with age greater than 65. 
		 * This single line replaces 5-6 lines of code that follows the inner class syntax.
		 */
		Predicate<Person> predOld = (p) -> p.getAge() >= 65;
		
		/*
		 * In case you need to add more conditions, we can duplicate using Lambda
		 */
		
		// Get younger people
		Predicate<Person> predYoung = (p) -> p.getAge() <= 40;
		
		/*
		 * Now, we need to traverse the collection.
		 * We are gonna use the forEach method now.
		 * It's a new method that was added in Java SE8
		 */
		
		
		
		/*people.forEach(p -> {
			if(predOld.test(p)){
				
				  If the condition is true, we print the output to the console
				 * This time we'll refactor the code and not explicitly call the toString method. 
				 * The Java run time will figure out that it needs to call it for us. 
				 
				System.out.println(p);
			}
		});*/

		displayPeople(people, predOld);
		displayPeople(people, predYoung);
		
		/*
		 * Now instead of having a forEach method, we could use a function that we can use repeatedly
		 * We can do so by selection our entire forEach implementation -> right click -> refactor -> extract method.
		 * Note that when you extract the method, it is  created automatically your main class's definition.
		 */
	}

	
	private static void displayPeople(List<Person> people, Predicate<Person> pred) {
		people.forEach(p -> {
			if(pred.test(p)){
				/*
				 * If the condition is true, we print the output to the console
				 * This time we'll refactor the code and not explicitly call the toString method. 
				 * The Java run time will figure out that it needs to call it for us. 
				 */
				System.out.println(p);
			}
		});
	}

}