package com.jb.understandingspringfactorybean;

public class LearnSpringBeanFactory {
	
	/*
	 * When we talk about Spring, the first thing that comes to mind is 
	 * "Dependency Injection"
	 * 
	 * -- the whole concept of dependency injection is possible because "Spring"
	 * is actually a container of beans.
	 * Spring behaves as a factory of beans.
	 * 
	 * So is it like Tomcat? Which is a servlet container in one sense?
	 * Yes, Tomcat creates the servlet objects which are required in order to 
	 * run an application.
	 * So, whenever we deploy an application, we would configure all the servlets
	 * in an xml and supply the classes. Now, Tomcat reads this xml and identifies
	 * the servlets that need to be instantiated and then it creates those servlets.
	 * 
	 * So, Spring is similar in a way that its a container of "BEANS". So, any 
	 * POJO that we have, could be contained inside a Spring container.
	 * 
	 * Spring container can hold any number of objects and it manages them too.
	 * That is, Spring handles the instantiation, lifecycle and the destruction of
	 * these objects.
	 * 
	 * For Spring to be able to manage our object, there should be a handle to that 
	 * object. The way it works is that the creation of these objects are taken care
	 * of by Spring itself. Therefore, when it comes to Spring, we don't create the 
	 * objects ourselves, as in "A a = new A()", but instead request Spring to create
	 * an instance of Class A. This is what we call "Factory pattern"
	 * 
	 * The Spring Factory pattern works as follows.
	 * 1. Spring has a "Bean factory".
	 * 2. The Bean factory generates objects for us.
	 * 3. So, going by the  example above, instead of creating a news instance of
	 * Class A by using the new keyword, we will reference the Bean Factory.
	 * 4. The Bean factory would in turn refer the Spring xml(blueprint of sorts)
	 * which needs to be supplied to Spring. It contains all the Bean definitions.
	 * 5. The bean factory creates a new bean from this blueprint here and then
	 * makes a news spring  bean. And then this Spring bean is handed over back to the object
	 * 6. Since the new bean was created inside the bean factory, Spring knows 
	 * about it and manages the entire lifecycle of that bean.
	 * 7. Here, Spring acts as a container to this newly created bin.
	 * 
	 * Note -- This is not dependency injection yet. We are still using the 
	 * factory pattern of the Spring framework and we are getting a bean out of it.
	 * We haven't started with the dependency injection yet.
	 * 
	 * 
	 * 
	 * Adding the objects to the Spring container is always advantageous.
	 * 
	 */

	public static void main(String[] args) {

	}

}
