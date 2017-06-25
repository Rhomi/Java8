package passingBehavior;

/*
 * The difference between OOP and Functional Programming
 * In OOP everything has to be an object.. There can be no standalone piece of code..
 * Everything has to be associated with a class or an object.
 * You, therefore start thinking of it in terms of nouns and thingss and not verbs and actions
 * Functional programming tries to solve this problem.
 * 
 * Let's say we want to create a simple "Hello World" program in Java using a 
 * method that prints this message to the console, which we are gonna call "Greet"
 * This method must be part of a class. And, it always performs the same action.
 * i.e. print the same message to the console.
 * 
 * Now, we can create a method signature by making the method accept "String" arguments
 * and print them to the console. 
 * 
 * But we need something more than that. We need to be able to pass in behaviour itself.
 * The method should be able to perform different things based on the input.
 * (Which could be done by having the method body perform a lot of conditional computation
 * based on the argument that it receives). But this enforces the idea that the
 * programmer must be aware of all scenarios well ahead to implement the conditional
 * constructs. Passing "Behaviour as construct is the best way to go.
 * 
 *  
 * This is not something only Java 8 is capable of. Java 7 supported this as well.
 * The way to do it is by create an interface or a class and pass its object (instance)
 * as an argument to the method we are talking about.
 * 
 * This object will have access to a custom method, lets call it "perform", that can
 * carry out the kind of action we would like to perform. This action ofcourse needs to 
 * be coded by the programmer and implemented.
 */

public class Greeter {

	public void Greet(){
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.Greet();
	}
	
	/*This example is gonna demonstrate how behavior could be passed as 
	 * an argument to methods.
	 */
}
