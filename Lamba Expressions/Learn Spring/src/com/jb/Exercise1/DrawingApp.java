package com.jb.Exercise1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		
		// Lets just try the regular way of instantiating a class with new
		Triangle triangle = new Triangle();
		triangle.draw();
		
		/*
		 * We haven't used Spring yet. So let's try it now?
		 * We wont be using the new command now. Instead we'll be using the bean
		 * factory. Let's instantiate the bean factory first.
		 * 
		 * To instantiate the bean factory, we need to use one of the many 
		 * available implementations of the bean factory. There are many bean
		 * factories available for the taking.
		 * 
		 * We are gonna use the XML Bean Factory. The use of this is that it 
		 * configures the bean factory using an xml file.
		 * 
		 * Earlier we discussed that the bean factory reads the blueprints of the
		 * different beans from a configuration file. We are planning to use
		 * an xml file to provide the configuration to Spring.
		 * 
		 * In order to read this xml configuration file, the bean factory has
		 * to be an xml bean factory.
		 * 
		 * The XML Bean factory takes in an argument "Resource" which is the actual
		 * configuration file. So, let's go ahead and create a FileSystem resource.
		 * We'll call it spring.xml
		 * 
		 * In the spring.xml file, we need to provide the blueprint for the bean
		 * that we need to instantiate. (In this case, for our Drawing app).
		 * We need to define the Triangle object.
		 * 
		 */
		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
		
		/*
		 * Now, that we have given the blueprint in the xml file (refer spring.xml)
		 * We can tell the bean factory to create a "triangle" bean. This will help the
		 * bean factory refer the blue print, looking for the bean called "triangle"
		 * which is identified by the "id" tag.
		 * 
		 * Here, we pass the id of the bean that needs to be instantiated to the 
		 * getBean method of the factory.
		 * 
		 */
		
		Triangle triangleObj = (Triangle)factory.getBean("triangle");
		triangleObj.draw();
		
		/*
		 * Now that worked!!
		 * The advantage of this might not be obvious right away. But as the application
		 * grow and objects start to become more complex, we can provide a blueprint of these 
		 * classes and Spring will take care of creating objects and maintaining their 
		 * life cycles.
		 */
	}

}
