package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape {
	
	
	private final int width;
	
	private final int height;
	
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
