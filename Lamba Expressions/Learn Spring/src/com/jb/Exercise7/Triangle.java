package com.jb.Exercise7;

import java.util.List;

public class Triangle {
	
	
	/* Instead of these 3 separate member variables, we are gonna have
	 * one single list of points.
	private Point pointA;
	private Point pointB;
	private Point pointC;
	*/
	
	private List<Point> points;
	
	public void draw(){
		for(Point point : points){
			System.out.println("Point = (" +point.getX()+ ", "+point.getY()+ ")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
