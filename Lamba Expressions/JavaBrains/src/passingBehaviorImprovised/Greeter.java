package passingBehaviorImprovised;


/* Comments #1
 * 
 * This example is gonna demonstrate how behavior could be passed as 
 * an argument to methods.
 * 
 * We'll create an interface called "Greeting" with a single method "perform"
 * and pass an instance of the interface to our Greet method.
 * 
 * What we are essentially doing is, passing behavior to our method and 
 * making the method perform whatever behavior the greeting instance is supposed
 * to exhibit by calling its perform method. 
 */

public class Greeter {

	public void Greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		/* 
		* Comments #2
		* 
		* The line below will stop working as the signature of the Greet method has 
		* changed now. It's started to accept arguments (and in this case, behaviour).
		* So, let's just comment it out.
		*/
		//greeter.Greet();
		
		
		/*
		 * Comments #4
		 * Now that we have implemented our interface, we are gonna pass the behavior
		 * to our method. 
		 * 
		 */
		
		HelloWorldGreeting greeting = new HelloWorldGreeting();
		greeter.Greet(greeting);
		
		/*
		 * Comments #6
		 * The advantage of this way of writing methods is that we can create as many
		 * implementations of the same interface and make our method perform different
		 * actions. Let's look at another example.
		 */
		
		Java8Rules java8Rules = new Java8Rules();
		greeter.Greet(java8Rules);
		
		/*
		 * Comments #7
		 * Did you just see what happened???
		 * Whooo!!!
		 * 
		 * This is classic OOP. It is polymorphism in action right here.
		 * 
		 * Let's recap polymorphism a bit --
		 * 
		 * "In object-oriented programming, polymorphism (from the Greek meaning 
		 * "having multiple forms") is the characteristic of being able to assign 
		 * a different meaning or usage to something in different contexts - 
		 * specifically, to allow an entity such as a variable, a function, 
		 * or an object to have more than one form."
		 */
	}
	
	/*
	 * Comments #3
	 * We haven' defined the behaviour yet. Remember, we have only defined an interface.
	 * We need to create an implementation of the interface to define its behavior.
	 * So we'll go ahead and create an implementaion, which we are gonnna name as 
	 * "HelloWorldGreeting"
	 * 
	 */
	
	
}
