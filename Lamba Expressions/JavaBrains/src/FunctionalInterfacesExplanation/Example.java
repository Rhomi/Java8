package FunctionalInterfacesExplanation;

/*
 * Comment #1
 * Prior to Java 8, we could only have abstract methods in interfaces
 * But now, we could implement our methods within the interface itself.
 * So for an interface to be considered as a type for a lambda expression,
 * it should and can have only one abstract method.
 * 
 * It could have other methods as well. But they have to be default implementations
 * In other words, implemented in the interface itself.
 */
public class Example {

	public static void main(String[] args) {
		
		/*
		 * Comment #2
		 * Lets create a custom functional interface which has an abstract method -> add()
		 * and a default method -> multiply.
		 * It is valid.
		 */
		AddFunctionalInterface lambdaAdd = (a,b) -> a+b; 
		
		/*
		 * Comment #3
		 * But when you try to write a lambda expression to implement the 
		 * default method of the interface, it throws an error as you can see
		 * below. Uncomment the line of code to see the error.
		 */
		//AddFunctionalInterface lambdaMultiply = (a, b, c) -> a*b*c;
		
		System.out.println(lambdaAdd.add(5, 10));
		
		/*
		 * Comment #4
		 * Now, a functional interface is something that is a property of an interface.
		 * It is not an interface type itself.
		 * 
		 * If you by any chance add another abstract method to the functional interface,
		 * it stops being a functional interface.
		 * 
		 * Java 8 has a special way of marking a functional interface from a normal
		 * interface. "The annotation" --> @FunctionalInterface
		 * 
		 * 
		 * 
		 */
	}
}
