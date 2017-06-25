package com.jb.Exercise3;

public class Triangle {

	private String type;
	private float height;
	
	/*
	 * Now we expect Spring to initialize the Triangle object by using this
	 * constructor.
	 * 
	 * After making the changes in the Triangle class and Spring.xml, the 
	 * code works.	 
	 * 
	 * Lets add one more variable called height. And add it to the constructor. 
	 * 
	 * Spring intelligently identifies the data types of the arguments passed to 
	 * the overloaded constructor of ours. But what if there is a scope for 
	 * confusion here and Spring misidentifies the properties and their types.
	 * Let's try and check that as well!!
	 * 
	 * Lets have 2 more constructors. One for height alone and the other for type.
	 */
	public Triangle(String type, float height){
		this.type = type;
		this.setHeight(height);
	}
	
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(float height){
		this.setHeight(height);
	}
	
	public void draw() {
		System.out.println(getType() +" triangle Drawn with height "+getHeight());
	}

	public String getType() {
		return type;
	}

	/*
	 *  Lets comment this out for now, to see if Spring is using the 
	 *  constructor to construct the object.
	 */
	/*public void setType(String type) {
		this.type = type;
	}*/

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}
