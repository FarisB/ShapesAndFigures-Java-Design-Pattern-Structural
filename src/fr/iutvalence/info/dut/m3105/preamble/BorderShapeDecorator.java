package fr.iutvalence.info.dut.m3105.preamble;

public class BorderShapeDecorator extends Shape {
	private Shape shape;
	private float thickness;
	
	public BorderShapeDecorator(float thickness) {
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return this.toString()+"[shape=" + shape + ", thickness="
				+ thickness + "]";
	}
	
	

}
