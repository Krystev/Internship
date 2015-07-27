package Chapter20;

public class Ex4_Test {

	public static void main(String[] args) {
		Ex4_Triangle tri = new Ex4_Triangle(2, 3);
		Ex4_Ractangle rac = new Ex4_Ractangle(5, 6);
		Ex4_Circle circle = new Ex4_Circle(10);
		
		Ex4_Shape[] list = {tri, rac, circle};
		
		double[] surfaces = new double[list.length];
		
		for (int i = 0; i < surfaces.length; i++) {
			surfaces[i] = list[i].calculateSurface();
		}
		
		for (double d : surfaces) {
			System.out.println(d);
		}
		
	}

}
