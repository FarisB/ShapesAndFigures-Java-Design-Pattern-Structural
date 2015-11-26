package fr.iutvalence.info.dut.m3105.preamble;

public class SolidFillShapeDecorator extends Shape {
	
	private Color color;
	private Shape shape;
	
	public SolidFillShapeDecorator(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.toString()+"[color=" + color + ", shape=" + shape
				+ "]";
	}

	

}
