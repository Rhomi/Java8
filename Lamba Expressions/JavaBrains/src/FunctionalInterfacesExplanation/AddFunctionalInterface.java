package FunctionalInterfacesExplanation;

@FunctionalInterface

/*
 * This annotation makes sure that the consumers of this interface 
 * wont be affected by any change made to this interface.
 */
public interface AddFunctionalInterface {
	
	int add(int a, int b);
	
	default int multiply(int a, int b, int c){
		return a*b*c;
	}

	/*
	 * If I add another abstract method to this interface, lets see what happens.
	 * When I add the abtract method diff(), it throws an error as follows
	 * 
	 * "Invalid '@FunctionalInterface' annotation; AddFunctionalInterface is not 
	 * a functional interface"
	 * 
	 * Hence, our functional interface would be protected from any potential changes
	 * 
	 * The annotation is completely optional. But its a good practice to use it
	 * to communicate your intention on how we plan to use this interface.
	 */
	
	//int diff(int a, int b);
}

