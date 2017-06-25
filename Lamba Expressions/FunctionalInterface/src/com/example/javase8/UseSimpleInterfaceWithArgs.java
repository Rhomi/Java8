package com.example.javase8;

import com.example.javase8.interfaces.SimpleInterfaceWithArgs;;

public class UseSimpleInterfaceWithArgs {
	
	public static void main(String[] args) {
		
		/* The goal is to instantiate our functional interface "SimpleInterface"
		 * And then to implement the single abstract method of the interface
		 */
		
		/* Simple Interface has a single abstract method that doesn't accept arguments
		 * To represent the signature of the method, we'll use a pair of paranthesis
		 * Now this is by definition, the first part of your Lambda expression style implementation
		*/
		
		/*
		 * Now we "implement the method" by using a single line of code
		 */
		
		SimpleInterfaceWithArgs obj = (v1,v2) -> 
		
		{
			/* Notice that we can perform any operation here based on our choice
			 We could even say v1*v2.. The method signature in our simple interface 
			 would still support that
			*/
			int result = v1+v2;
			System.out.println("The result is "+result);
		};
		
		/*
		 * Now we have defined an object of type SimpleInterface
		 * 
		 */
		obj.doSomething(10,5);
	}

}
