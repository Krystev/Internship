package Chapter20;

public class Ex4_Triangle extends Ex4_Shape{

	public Ex4_Triangle(double width, double height) {
		super(width, height);
		
	}
	
	@Override
	public double calculateSurface() {
		return (this.getHeight() * this.getWidth() / 2);
	}

}
