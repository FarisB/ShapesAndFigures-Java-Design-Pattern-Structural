package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Circle circle= new Circle(5);
		Position position=new Position(2,2);
		ShadowShapeDecorator shadow= new ShadowShapeDecorator(45, 5);
		circle.draw(position);		
	}

}
