package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=12;
		this.height=10;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public void draw() {
		
	}
	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}

		

}


