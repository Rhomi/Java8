package passingBehaviourWithLambdaExpressions;

import passingBehaviorImprovised.HelloWorldGreeting;

/*
 * Comments #1
 * Now, in the previous exercise, we were able to pass behavior to the method.
 * Does that solve our problem???
 * It does. But maybe not in the most concise, elegant manner.
 * Because we are not actually passing behavior as such. Instead we are passing an
 * object that exhibits a certain behavior.
 * In other words, we are not passing the intended behavior "perform",
 * Instead we are passing an object "greeting" which has a method called "perform"
 * 
 * The coolest thing to expect now is that we should be able to pass an action
 * rather than having a class implementation of an interface's action.
 * 
 * It would look something like this	 
 * 
 */

/*public void Greet(action){
	action();
}*/


/*
 * Comments #2
 * Now, Lambdas set out to achieve this goal.
 * It let's us create these entities i.e functions that are not methods of a class.
 * In other words, they are not associated to any class. They are functions that exist 
 * in """"isolation""" <- emphasis
 * 
 * Now, the best part is these functions can be treated as values.
 */


/*
 * Comments #3 
 * Functions as values is straight out of functional programming and very confusing for
 * OOP Programmers.
 * 
 * Let's talk about inline values
 * Examples of inline values are
 * 
 * String message = "Hello World"
 * Here "Hello World" is the value which is of type String assigned to a variable named "message"
 * 
 * Likewise
 * Double pi = 3.14
 * Here, 3.14 is the inline value assigned to the double variable pi.
 * 
 * The general idea is, data can be assigned as value to variables.
 * We can also assign objects to a variable as value.
 * Example Student student = new Student();
 * Here, an instance of the type Student is assigned as value to the variable "student"
 * 
 * 
 * Now, can we assign a block of code to a variable as value???????
 * 
 * We are not talking about the return of the block code of execution being assigned 
 * as a value to a variable. We are not talking about the result being assigned as value.
 * 
 * We are talking about the block itself, assigned as a value to a variable.
 * And wherever the variable goes, the piece of code goes with it.
 * Just like how our "pi" variable can be used anywhere.
 * 
 */

/*
 * Comments #4
 * Let's look at how we used to define methods prior to Java 8
 * And how we can assign the method itself to a variable
 * 
 * It looks something like this. Let's consider our "perform" method.
 * 
 * ourVariable = public void perform(){
 * 	System.out.println("Hello World!!");
 * 	}
 * 
 */

/*
 * Comment #5
 * Now, there is a couple of changes to be made in this assignment expression.
 * Let's go over it one step at a time.
 * 
 * Step #1
 * We are looking at the "public" keyword.
 * "public" is a keyword used to specify the accessibility of a method when a method
 * is associated with a class. We usually declare them public/private/protected.
 * But it doesn't make sense to declare a method in "isolation" as public.
 * So we get rid of that. BOOM!!!!
 * 
 * 
 * Step #2
 * We are gonna work on the method name "perform" next.
 * As we are gonna assign this method to the variable "ourVariable",
 * it doesn't make a whole lot of sense for it to have another name "perform"
 * We are gonna be addressing/referring to this block of code by the variable name
 * "ourVariable"' moving forward. So let's get rid of that too. BOOOMMMM!!!
 * 
 * 
 * Step #3
 * Return type "void", we are coming for you now.
 * 
 * The creators of Lambda expression really made it work here.
 * The Java compiler is now smart enough to look at the code and understand the 
 * return type of the method without us having to explicitly stating it as void/String et al
 * Cos, just by looking at the code, we could say that too. The method doesn't return
 * anything and if it were returning something like say "5", we could say the return type is "int"
 * If it returned "Hello World!", we could say its String.
 * 
 * Likewise, the Java compiler is now capable enough to figure that out by itself.
 * Hence we get rid of the keyword "void" as well.
 */

/*
 * Comment #6
 * 
 * Now, we have got rid of everything and what's left is
 * 
 * ourVariable = (){
 * 	System.out.println("Hello World!!");
 * 	}
 * 
 * The rounded brackets "()" is the arguments that the method accepts.
 * (Which here is empty cos it accepts no arguments)
 * 
 * This is pretty much a Lambda expression, except for one small addition
 * ourVariable = () -> {
 * 	System.out.println("Hello World!!");
 * 	}
 * 
 * "The pointer" ->
 * 
 * Now we have a valid lambda expression.
 * 
 * For a one-line body, we can get rid of the curly braces.
 * ourVariable = () -> System.out.println("Hello World!!");
 * 
 * Now for a multi-line body, we'll need the curly braces.
 */


public class Greeter {
	
	/* 
	 * Comments #7
	 * This is how our greeting implementation in Lambda syntax would look like
	 * This is an inline function that takes no argument and has a single-line body.
	 * Now, since we haven't declared a type for our function yet, it is gonna throw
	 * an error. In Java it is imperative that we declare the type of the function.
	 */
	//greetingFunction = () -> System.out.println("Hello World!!");
	
	/*
	 * Let us look at the advantages of having this type of implementation.
	 * 1. This variable greetingFunction could be passed around.
	 * 2. It could be supplied as an argument to the methods in our classes.
	 * 3. We have encapsulated a function in a variable, which could be passed around.
	 * 4. Another advantage is that we dont even need to have a variable hold 
	 * the inline function. We could directly pass the lambda expression to the method.
	 * Looks something like this
	 * greet(() -> Sysout("Hello World!"));
	 * 
	 * 5. When it is a single line body, we dont even have to mention the 
	 * keyword "return"
	 * Example 
	 * computeSum = (int a, int b) -> a+b;
	 * The java compiler is gonna look at the body and return the result of the execution
	 * 
	 * Another example
	 * lenthGetter = (String s) -> s.length();
	 * 
	 * 6. Safe divide function with multi-line body
	 * 
	 * safeDivideFunction = (int a, int b) -> {
	 * 	if(b == 0) return 0;
	 * 	return a/b;
	 * };
	 */
	
	
	public void Greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		/*
		 * Comment #8
		 * Now let's go ahead and 	implement our lambda function.
		 */
		
		/*
		 * Comment #11
		 * Continued from comment #10
		 * We have defined our interface. Hence we can now say that the 
		 * function type of our lambda method is MyLambda.
		 * So our variable ourLambdaFunction is of type  MyLambda now.
		 * Now, Java compiler has all the information it needs to identify our variable.
		 */
		
		/*
		 * Comment #12
		 * Let's look at another example
		 * 
		 */
		
		MyAdd addFunction = (int a, int b) -> a+b;
		
		MyLambda ourLambdaFunction = () -> System.out.println("Hello World!");
		
		/*
		 * Comment #9
		 * With the above implementation, we get an error saying that 
		 * the expression must be a functional interface.
		 * We are going to use Java's well defined Interface style of declaring
		 * functions and methods. Let's do it.
		 * 
		 */
		
		/*
		 * Comment #13
		 * The interesting part.
		 * For our lambda function, we already have created an interface (Greeting) that 
		 * has a method that has a very similar signature.. So can we use that??
		 */
		
		Greeting ourLambdaFunction1 = () -> System.out.println("Implementing already"
				+ "available interface Greeting");
		
		
		// ************** A few questions!!1****************
		/*
		 * Comment #14
		 * Now can we have more than one method in our interface/?
		 * Nope. A functional interface can have only one method.
		 */
		
		/*
		 * Comment #15
		 * Alright, so what's the difference between our previous code and the 
		 * new lambda style code???
		 * 
		 * i.e how is this better than this 
		 * Greeting greeting = new HelloWorldGreeting(); ?????
		 * 
		 * The code above is creating an instance "greeting" of a specific 
		 * implementation "HelloWorldGreeting" of the "Greeting" interface.
		 * 
		 * Whereas in our lambda expression, we are implementing the only method
		 * in the Greeting interface.
		 * 
		 * So what's the difference?
		 * 
		 * 1. Let's try something
		 */
		
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello World!!!!!!");
		
		// Now let's call the perform method of the Greeting interface.
		helloWorldGreeting.perform();
		// Now let's try the same with our lambda greeting.
		lambdaGreeting.perform();
		// That works too.
		
		/*
		 * Comment #16
		 * This is how execute lambda expressions.
		 * By calling the interface method on it, just as if were an instance 
		 * of a class (a class that implements the interface).
		 * 
		 * The lambda expression is actually a function here.
		 * So, in a way, we are implementing the interface by just implementing the function
		 * and not implementing a class.
		 * 
		 * That's the difference between these two styles.
		 * In the first one, we have a class that implements the interface.
		 * Whereas here, we are creating a functional implementation and not a class.
		 * In short, it is a lamba expression of type interface, "Greeting"
		 */
		
		/*
		 * Comment #17
		 * Now, we could have done the class implementation thingy using an
		 * inner class style of implementation as well.
		 * Like this..
		 * 
		 * We could define the perform method right inside the inner class.
		 * Its a class that we define inside another class. Hence, an inner class. 
		 * And notice that it doesn't have a name. So it's an anonymous inner class.
		 */

		Greeting innerClassGreeting = new Greeting() {
			public void perform(){
				System.out.println("Hello World!!!!");
			}
		};
		
		// Lets see how it works.
		innerClassGreeting.perform();
		
		/* What inner class is completely different from a lambda expression.
		 * Lambda is not a fancy short cut of an inner class.
		 */
		
		
		
	}
}

/*
 * Comment #10
 * We declare a functional interface.
 * And we declare a method for the interface which has the exact same signature 
 * as our lambda function "ourLambdaFunction".
 * 
 * Actually it should be the other way around. But, since we wrote our function first
 * and wanted to define the function's type later, we are taking this approach.
 * 
 * Ok, now the method the interface has will have a return type void and accepts
 * no arguments because that's the signature of our custom "ourLambdaFunction" function
 * So, we create a method saying "void interfaceMethod();"
 */
interface MyLambda {
	void interfaceMethod(); 
}