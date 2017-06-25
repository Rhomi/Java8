package passingBehaviourWithLambdaExpressions;

/*
 * Using an Interface as a Type. ... 
 * You can use interface as your data type name. 
 * If you define a reference variable whose type is an interface, 
 * any object you assign to it must be an instance of a class that implements the interface.
 * Or an implementation of the interface as seen in the lambda expression examples.
 */
public class TypeInterfaceExample {
	
	public static void main(String[] args){
		
		//######################## Implementation 1 ######################
		
		StringLengthLambda strLenLambda = (String s) -> s.length();
		
		//This line wont produce an output.
		strLenLambda.getStringLength("This is my first implementation");
		
		//To see the length of the string passed, you need to print it to the console
		System.out.println(strLenLambda.getStringLength("This is my first implementation"));
		
		/*
		 * The magic of using functional interfaces and defining the type of the lambdas
		 * by their type is that the compiler has more info on the method implemented,
		 * and therefore we dont need to specify in the lambda expression that we are 
		 * passing a string. Hence we could change our implementation as follows.
		 */
		
		//####################### Implementation 2 ########################
		
		StringLengthLambda strLenLambdaAlternate = (s) -> s.length();
		
		System.out.println(strLenLambdaAlternate.getStringLength("This is my alternate implementation"));
		
		//###################### Implementation 3 #######################
		/*
		 * It will still work. 
		 * Now, since the method accepts only one argument, we could further improvise
		 * We could get rid of the parenthesis and its still valid
		 */
		
		
		StringLengthLambda strLenLambdaYetAnother = s -> s.length();
		System.out.println(strLenLambdaAlternate.getStringLength("Yet another implementation"));
		
		
		
		/* 
		 * ###################### Implementation 4 ####################
		 * Lets look at one last implementation
		 * Define a method outside your main method called "printLength"
		 * It looks like the one written below.
		 * Call it by passing a lambda expression which is of type StringLengthLambda.
		 * If you change the signature of the lambda expression, the compiler
		 * will throw an error
		 */
		
		// Both are valid statements
		printLength((a) -> a.length());
		printLength(b -> b.length());
	}
		
		public static void printLength(StringLengthLambda s){
			System.out.println(s.getStringLength("Hello World"));
		}

}
