package com.jb.Exercise2;

public class Triangle {

	private String type;
	
	/* The type variable is a member variable of the class.
	 * Now, when the Traingle class is actually instantiated like we did just now,
	 * we could preset the "type" in the blueprint and get an
	 * object instantiated which has that preset type.
	 */
	
	/*
	 * Lets change the draw method a lil bit so that we can know what type of 
	 * triangle is getting drawn.
	 */
	public void draw() {
		System.out.println(getType() +" triangle Drawn!!");
	}
	
	/*public void draw() {
		System.out.println("Triangle Drawn!!");
	}*/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
