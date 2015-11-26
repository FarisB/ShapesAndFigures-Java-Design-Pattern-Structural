package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends Shape{

		private Shape shape;
		private int angle;
		private int intensity;
		
		public ShadowShapeDecorator(int angle, int intensity) {
			this.angle = angle;
			this.intensity = intensity;
		}

		@Override
		public String toString() {
			return this.toString()+"[shape=" + shape + ", angle=" + angle
					+ ", intensity=" + intensity + "]";
		}
		
}
