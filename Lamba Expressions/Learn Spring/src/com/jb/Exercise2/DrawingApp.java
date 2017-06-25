package com.jb.Exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * In this tutorial, we are gonna use another object called 
 * "Application Context" which is more powerful and a superset of 
 * BeanFactory. It can do everything Bean Factory does with additional
 * functionalities as well like Event notification, AOP etc.
 * 
 * There isn't any huge trade off in performance as well. Unless the 
 * resources that we have are very minimal (in which case we will have 
 * to stick with the Bean Factory), we can use the Application Context.
 */

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * Just like the Bean factory, the application context is also
		 * an interface. Hence, we have different implementations depending
		 * on our configuration.
		 * 
		 * We have something called the Classpath Xml Application Context
		 * which is in a way similar to what we did in Exercise 1 where we picked
		 * up an xml file from an actual class path of our application.
		 * 
		 * Here, you don't have to define a new FileSystem Resource.
		 * We could just specify the xml file's name as a string argument.
		 * 
		 * Note - The classpath would be the src folder of the application.
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// Instead of the factory instance, use the context object.
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		/*
		 * That worked as well!!
		 * 
		 * Now, lets go ahead and make our Triangle object a bit more bigger/complex.
		 * After the changes are made, the output printed is "Equilateral triangle Drawn!!"
		 * 
		 * This is in a way - dependency injection.
		 * 
		 * Cos, the value of the type variable, is injected by Spring. Any value that we 
		 * need, could be injected in the same fashion.
		 */
	}

}
