package org.example.java8;

/*
 * In addition to the new lambda syntax, Java SE8 adds a number of new functional interfaces. 
 * One of the most useful is called the Predicate Interface. 
 * An interface that has a single boolean method named Test, 
 * that you can use to wrap up your conditional processing, and make conditional code a lot cleaner. 
 */

// The following implementation shows how we could use the functional interface "Predicate"
// Using the regular syntax.
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateInnerClass {
	public static void main(String args[]){
		 
		// Here, we have declared a list of "Person" objects
		/*
		 * Check the Person class.
		 * It has got two private fields
		 */
		List<Person> people = new ArrayList<>();
 
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		/*
		 * The goal of our implementation is to filter this person list and display selected people.
		 * We are gonna use the inner class syntax and later the Lambda syntax using the Predicate interface.
		 */
		
		
		// Method #1 -- Inner Class Syntax

		/*
		 * Declare an instance of the Predicate interface
		 * It is a member of the package Java.util.function
		 * The interface needs a generic type declaration.. which here is Person (our custom class)
		 * Remember in the last example, we set the generic type of Comparator interface to "String"?
		 */
		
		/*
		 * For inner class syntax, we'll start with the new keyword, 
		 * Then press Ctrl+Space and choose the constructor for the predicate interface. 
		 * When we choose that, Eclipse automatically implements the single abstract method, "Test". 
		 * Since we declared our predicate with a generic type of person, the test method accepts a single argument of that type as well. 
		 */
		Predicate<Person> pred = new Predicate<Person>() {
			/*
			 * Now, we're going to implement the method. 
			 * We are going to change the name of the person object being passed in, to just p.
			 */
			@Override
			public boolean test(Person p) {
				/*
				 * So now our predicate object "pred" encapsulates our method "test", 
				 * and the test method can be used to determine whether I want to process an object from our collection "people". 
				 * We are only gonna return people with age greater than 65.
				 */
				return (p.getAge() >= 65);
			}
		};
		
		/*
		 * The next step is to traverse the collection. 
		 * And you can do this in a number of ways with a forEach loop, an iterator object, or with the new forEach method.
		 * We'll use the classic forEach loop.
		 */
		for (Person person : people) {
			if(pred.test(person)){
				System.out.println(person.toString());
			}
		}
		
		/*
		 * Running this code is gonna return the record Mike 73
		 * We could change the condition by altering the condition specified within our predicate object declaration
		 * But we need a more concise and readable way of doing things.
		 * Hence we are gonna Lambda expression here.
		 * Switch over to PredicateLambda class
		 */
		
	}
}
