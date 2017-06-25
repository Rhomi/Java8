package com.jb.Exercise3;

import org.springframework.context.ApplicationContext;

/*
 * In the previous exercise, we saw that Spring injected the value "Equilateral"
 * into the type property of the Triangle bean.
 * 
 * The way that it did was by using the setter - setType() of Triangle. This is 
 * called "Setter Injection".
 * 
 * Now, we are gonna look at "Constructor injection"
 * 
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
