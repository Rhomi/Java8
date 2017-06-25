package RunnableUsingLambda;

/*
 * Comment #1
 * We don't have a new "function type" in Java (for lambda type functions)
 * Java has reused the interface type for this purpose.
 * 
 * There are several reasons why Java has decided to use interface type instead of designing
 * a whole new function type.
 * 
 * The most important reason would be "Backward-compatibility"
 * 
 * The advantage of using an interface type is that we can use lambda expressions
 * in place of 1. anonymous inner classes and 2. all the method signatures which accept 
 * the interface. This is a great advantage in terms of backward compatibility.
 * 
 */

/*
 * Comment #2
 * Let's look at our runnable interface
 * In order to create a Thread, we need to create an instance of the "Runnable interface"
 * and use that instance to create a new thread.
 * 
 * Can we create Lambda style thread implementation??
 * Yes. Because the runnable interface houses just one method called "run" and
 * it is perfect for lambda style function expression.
 * 
 * Remember :  With Lambda, we can only implement interfaces that has only one 
 * abstract method.
 * 
 */

public class LambdaThreads {

	public static void main(String[] args) {

		/*
		 * Comment #3
		 * Lets see how we could create a thread the inner class way.
		 */
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inner class style thread");
			}
		});
		// Now that we have created a thread, let's run it.
		// Spawn a thread and run it.
		myThread.run();
		
		/*
		 * Comment #4
		 * Now, instead of creating an inline anonymous inner class, 
		 * we could do it the lambda way.
		 * The thread constructor "Thread()" doesn't know any better.
		 * We can create a lambda expression that has the same signature as the run()
		 * method which is the one method in the Runnable interface.
		 * All that the constructor expects is an instance of Runnable.
		 * So, we are gonna sneak in and use a lambda and our lambda is gonna perfectly
		 * mimic the runnable interface.
		 */
		
		/*
		 * Comment #5
		 * The lambda will have an empty parathesis as the run() method of Runnable
		 * interface doesn't accept any arguments.
		 */
		
		Thread lambdaThread = new Thread(() -> System.out.println("Lambda style thread"));
		
		lambdaThread.run();
		
		/*
		 * Now, to comprehend this, do you know that Threads were implemented in Java 
		 * even before Java 8 came out??
		 * Yes, and do you see any change being made to this particular implementation of 
		 * thread to accommodate the new lambda style function?
		 * 
		 * No. Because, the lambda here behaves the same way as an implementation of the 
		 * Runnable interface and therefore is indistinguishable from the inner class style
		 * implementation we saw above. The thread class accepts them both as the same.
		 * 
		 * This is the magic of having "the interface mechanism" to declare lambda.
		 * You get this huge backward compatibility.
		 * 
		 * And all the APIs we are familiar with, in Java, like the Thread class here
		 * don't have to be rewritten to accommodate lambdas here.
		 * 
		 * The only limitation is that the interfaces these lambdas implement can have only 
		 * one abstract method. "Runnable" is one of those very perfect candidates.
		 * These interfaces are called as functional interfaces.
		 * 
		 */
	}
}
