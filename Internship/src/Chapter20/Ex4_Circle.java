package Chapter20;

public class Ex4_Circle extends Ex4_Shape {

	public double diameter;

	public Ex4_Circle(double diameter) {
		super(diameter / 2 , diameter / 2);
		this.diameter = diameter;

	}

	@Override
	public double calculateSurface() {
		return Math.PI * Math.pow((this.diameter / 2), 2);
	}

}
