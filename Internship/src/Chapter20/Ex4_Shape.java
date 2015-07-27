package Chapter20;

public class Ex4_Shape {
	private double width;
	private double height;
	
	public Ex4_Shape(double width, double height) {
		super();
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public Ex4_Shape() {
		
	}
	
	public double calculateSurface() {
		return 1;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
