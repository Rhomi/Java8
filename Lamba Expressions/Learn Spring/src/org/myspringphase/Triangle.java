package org.myspringphase;

public class Triangle {
	
	private String type;
	
	public void draw(){
		System.out.println(getType()+" triangle Drawn!!");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
