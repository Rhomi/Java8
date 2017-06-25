package Unit1Exercise;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import Unit1Exercise.Person;

public class Exercise1SolutionJava7 {

	public static void main(String[] args){
		/*
		 *  We are going to use asList which takes inline elements and creates
		 *  objects with them.
		 */

		List<Person> person = Arrays.asList(
				new Person("Deepak", "George", 27),
				new Person("Gopal", "Krishna", 24),
				new Person("Ram", "Chander", 22),
				new Person("Manoj", "Mishra", 30)
				);

		// Step 1 : Sort Persons by last name
		/* We can use the collection interface and the sort method in it.
		 * The sort method accepts two arguments.
		 * 1. The list to be sorted and
		 * 2. The comparator instance to compare and sort the list elements.
		 * 
		 * We are gonna define an inline Comparator instance which overrides 
		 * the compare method, taking in two arguments at a time 
		 * and returning the result of the comparison.
		 */

		Collections.sort(person, new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareToIgnoreCase(p2.getLastName());
			}
		});

		// Step 2 : Create a method that prints all the elements in the list
		/*
		 * Now, that we have sorted our list, create a method that prints the list.
		 * Now, we are gonna create a method called printPerson (outside our main method) and call it, by passing
		 * person (an instance of the Person type, which is our list of persons) as an argument.
		 */

		printPerson(person);

		//Step 3 : Create a method that prints only the people whose last names starting with M
		
		
		//Inflexible  approach
		printPersonWithLastNameStartingWithC(person);

		//Flexible approach
		/*
		 * This is the method that passes the behavior to our target method
		 * Here, we can see that the "method call" statement includes two parameters.
		 * 1. The person list and 
		 * 2. A condition that states the behavior to be passed.
		 * We are defining an instance of the Condition Interface and 
		 * specifying what needs to be done with our list.
		 * 
		 * The condition interface is a custom interface that we have defined with one method called test()
		 * that takes in an argument of type Person.
		 * 
		 * Here we are overriding that method (implementing that method) 
		 * 
		 * The advantage of this method is that the behavior could be changed here 
		 * and our target method will act accordingly
		 * 
		 * 
		 * Why don't we try passing another  behavior to the method the same way??
		 * Let's fetch all persons whose last names end with a
		 */
		printConditionally(person , new Condition(){
			@Override
			public boolean test(Person p){
				/* The method returns a boolean value
				 * when the startsWith() method returns a true for the list given.
				 */
				return p.getLastName().startsWith("M");
			}
		});
		
		printConditionally(person , new Condition(){
			@Override
			public boolean test(Person p){
				System.out.println("Ends with a");
				return p.getLastName().endsWith("a");
			}
		});
	}

	// The following methods are to implement Step 3

	/*
	 * I'll demonstrate an inflexible way of implementing Step 3 and flexible way of doing it.
	 */

	// Inflexible approach
	private static void printPersonWithLastNameStartingWithC(List<Person> person){
		/* Pardon the really long method name.
		 * It's more or less our printPerson() method. Except that we add an if condition here
		 * As follows
		 * And call this method from inside the main method, passing the person list as a parameter to it.
		 */
		for(Person p : person){
			if(p.getLastName().startsWith("M")){
				System.out.println("Output from inflexible implementation");
				System.out.println(p.getFirstName());
				System.out.println("_____________________________________");
			}
		}
	}

	// Flexible approach
	
	/*
	 * Rather than having the condition written right inside the method,
	 * we could have the condition passed as an argument.
	 * Therefore, it is equivalent to passing behavior as argument that
	 * tells the method what to do.
	 */
	private static void printConditionally(List<Person> person, Condition condition) {
		for(Person p : person){
			/*
			 *  If any element in the person list satisfies the condition that is passed,
			 *  then, write them to the console.
			 */
			
			if(condition.test(p)){
				System.out.println("Output from Flexible implementation");
				System.out.println(p.getLastName());
				System.out.println("____________________________________");
			}   
		}
	}
	
	
	

	// This method is for our Step 2
	private static void printPerson(List<Person> person){
		for(Person p : person){
			System.out.println(p.getFirstName());
		}
	}

	/* When we run the code after the implementation of the printPerson method,
	 * We notice that the output is as follows,
	 * Ram
	 * Deepak
	 * Gopal
	 * Manoj
	 * 
	 */

}
