package Chapter20;

public class Ex4_Ractangle extends Ex4_Shape{

	public Ex4_Ractangle(double width, double height) {
		super(width, height);
	}
	
	
	@Override
	public double calculateSurface() {
		return this.getHeight() * this.getWidth();
	}

}
