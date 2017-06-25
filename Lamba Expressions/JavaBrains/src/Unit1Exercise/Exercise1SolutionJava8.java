package Unit1Exercise;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import Unit1Exercise.Person;

public class Exercise1SolutionJava8 {

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

		
		/*
		 * We are gonna implement all the steps using Lambda expressions in this solution.
		 * Step 1 : Sort the list
		 * Instead of creating an inline anonymous inner class approach, we could use a lambda syntax
		 * The sort methods needs an implementation of the Comparator Interface.
		 * To do it right, we need to implement the compare method of the interface.
		 * Lambdas could just do that for us.
		 * The Collections last name wouldn't know the difference between the two approaches.
		 * Remember -> Comparator is a functional interface cuz it only has one method.
		 */
		
		Collections.sort(person, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		/*
		 * Now, the same lambda expression could be written as follows, without having to mention
		 * that the parameter being passed is of type Person.
		 * 
		 * That is because, the Collections interface already knows the type of the list.
		 * person is a list object of generic type Person.
		 * Hence we don't need to mention in the parameter list explicitly.
		 * 
		 * Hence, the below statement is just as valid.
		 */
		
		Collections.sort(person, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		/*
		 * Step 2 - Print all persons
		 */
		//printPerson(person);
		
		/*
		 * Step 3 - Print all persons whose last names end with as
		 */
		
		
		System.out.println("Conditional Printing");
		//printConditionally(person , (p) -> p.getLastName().endsWith("a"));
		// It's the same as
		System.out.println("Print all persons whose last name ends with a");
		printConditionally(person , p -> p.getLastName().endsWith("a"));
		
		/*
		 * Now, there is yet another improvisation we can do.
		 * We have two methods to print the person object. 
		 * One, the whole list (after sorting)
		 * Second, based on a condition.
		 * 
		 * We could get rid of the first one and use the second one to print all the 
		 * list items by just setting the condition to "true" all the time
		 */
		
		/*
		 * So we could just comment out the printPerson method and 
		 * call the printConditionally method, setting the condition to true by default.
		 * It looks like this.
		 */
		
		System.out.println("Printing the entire sorted list with the conditional method");
		printConditionally(person, p -> true);
		
		/*
		 * To understand the above code better, recall that p is the parameter passed 
		 * (remember that this lambda expression is an implementation of the Condition interface and its test method)
		 * and after the pointer symbol what we have is the body of the test method's implementation.
		 * The body just contains the boolean expression "true"
		 * 
		 * By the way, The test method happens to return a boolean type.
		 * 
		 * It is just like the mySample method we have right here.
		 */
		
		
		//Exercise1SolutionJava8 obj = new Exercise1SolutionJava8();
		//System.out.println(obj.mySample());
		
	}

	/*private static void printPerson(List<Person> person) {
		for(Person p : person){
			System.out.println(p.getFirstName());
		}
		
	}*/

	private static void printConditionally(List<Person> person, Condition condition) {
		for(Person p : person){
			System.out.println("The condition's result is "+condition.test(p)+ " for "+p.getFirstName());
			if(condition.test(p)){ // This evaluates to true or false.
				//System.out.println(condition.test(p));
				System.out.println(p.getLastName());
			}   
		}
	}
	
	/*private static boolean mySample(){
		return true;
	}*/
}
