
/*
 * A lambda expression in Java 8 lets you define a class and a single method with very
 * concise syntax implementing an interface that has a single abstract method.
 * 
 * Lets developers simplify and shorten their code, Making it more readable and maintainable.
 * 
 */




/*
 * 
 * Prior to Java SE 8, if you wanted to create a thread, this is how you'd  proceed
 * 
 * ************* STEP 1 ***********************
 * you'd first define a class 
 * that implements the "Runnable" interface. This is an interface that has a 
 * single abstract method named "Run" that accepts no arguments. 
 * 
 * The code will look something like this
 * 
 */


/*public class MyRunnable implements Runnable {
	@Override
	public void run(){
		System.out.println("Hello");
	}
}*/


// ******************* STEP 2 **********************
/*
 * The code above should be defined in its own code file i.e .java file 
 * like MyRunnable.java
 * 
 * 
 * ******************* STEP 3 *************************
 * 
 * Your class "MyRunnable" would then implement the single abstract method run()
 * of the "Runnable" interface. In the current implementation, it just outputs a 
 * literal string "Hello".
 */

 /* ************************ STEP 4 ****************
 * 
 * You would then take that object, and pass it to an instance of the thread class. 
 * I'm instantiating my runnable as an object named "r". Passing it to the 
 * thread's constructor and calling the thread's start method. 
 */

// The code will look something like this

/*MyRunnable r  = new MyRunnable();
new Thread(r).start();*/
 

/* ************************ THE RESULT ************************
 * My code will now run in its own thread and its own memory space. 
 */





// ********************* ALTERNATIVE - 2**************************


/* Prior to Java SE 8, you could improve on this code a bit, 
 * instead of declaring your class in a separate file, you might 
 * declare it as single use class, known as an inner class, 
 * local to the method in which it's used.
 */


/*
 * This is how you do it ------------>
 * I'm once again creating an object named r, but I'm calling the "Runnable"
 * interface's constructor method directly. And once again, implementing it's 
 * single abstract method "run()". Then I'm passing the object to the thread's 
 * constructor. 
 */


/*Runnable r = new Runnable() {
	@Override
	public void run() {
		System.out.println("Hello");
	}
};


new Thread(r).start();*/




// ********************* ALTERNATIVE - 3 **************************



 /* And you can make it even more concise, by declaring the class as 
 * an anonymous class, so named because it's never given a name. 
 * I'm instantiating the runnable interface and 
 * immediately passing it to the thread constructor. I'm still implementing the 
 * run method and I'm still calling the thread's start method.
 */

/*
new Thread(new Runnable() {
	@Override
	public void run() {
		System.out.println("Hello");
	}
}).start();*/

	
// *********************** Now the Java 8 Implementation *************
// ************************* ALTERNATIVE -4 *************************


/* In Java SE 8 you can re-factor this code to significantly reduce it and 
 * make it a lot more readable. The lambda version might look like this. 
 */

/*
Runnable r = () -> System.out.println("Hello");
new Thread(r).start();*/

// What did I just do here???
/* 
 * I'm declaring an object with a type of runnable 
 * But now I'm using a single line of code to declare the "single abstract method implementation"
 * -- which means the "run()" method -- which takes no arguments, 
 * (therefore empty braces)
 * then once again I'm passing the object to the Thread's constructor. 
 * 
 * --> The advantage
 * You are still implementing the runnable interface and calling it's run method 
 * but you're doing it with a lot less code. 
 */



/* Here is an important quote from an early specs document about Project Lambda.
 *  
 * "Lambda expressions can only appear in places where they will be assigned to a 
 * variable whose type is a functional interface."
 *  
 * A functional interface is an interface that has only a single "custom" abstract method. 
 * 
 * "For our interface, we have used a custom implementation of the run() method"
 * 
 * It means, one that isn't inherited from the object class. 
 * Java has a lot of these interfaces such as Runnable, Comparable, and many others.
 *
 * Prior to Java 8 they were known as Single Abstract Method or SAM interfaces. 
 * In Java 8 we now call them functional interfaces.
 * 
 * 
 * Our lambda expression is returning an implementation of the runnable interface, 
 * it has two parts separated by a new bit of syntax called the "arrow token"
 * or the "Lambda operator". 
 * 
 * 
 * ************ THE LAMBDA IMPLEMENTATION -M BROKEN DOWN *****************
 * The first part of the lambda expression, before the arrow token, 
 * is the signature of the method you're implementing.
 * In our code, it's a no arguments method so it's represented just by parentheses. 
 * 
 * 
 * But if I'm implementing a method that accepts arguments, 
 * I would simply give the arguments names. 
 * I don't have to declare their types. 
 * Because the interface has only a single abstract method, the data types 
 * are already known. 
 * 
 * And one of the goals of a lambda expression is to eliminate unnecessary syntax. 
 * The second part of the expression, after the arrow token, 
 * is the implementation of the single method's body.
 * (To implement a method body with multiple statements, wrap them in braces.)
 * Like this
 */
/*
Runnable r = () -> {
	System.out.println("Hello");
	System.out.println("World");
};*/

	
/*
 * So, to summarize, 
 * Before the arrow --> Signature of the method
 * After the arrow --> Body of the method
 * 

 *  
 * Lambda Expressions can reduce the amount of code you need to write and 
 * the number of custom classes you have to create and maintain. 
 * If you're implementing an interface for one-time use, 
 * it doesn't always make sense to create yet another code file or 
 * yet another named class. 
 * 
 * A Lambda Expression can define an anonymous implementation for one time use 
 * and significantly streamline your code.
 */

