package com.javaex.ex01;

public abstract class Shape {
	
	protected String fillColor;
	
	public Shape() {
	}
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	
	
	public String getFillColor() {
		return fillColor;
	}

	public abstract void draw();
}


