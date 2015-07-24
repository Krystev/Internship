package Chapter11;

public class Cat {
	public static int count = 0;
	String name;
	String color;
	
	public Cat () {
		this.name = "unnamed";
		this.color = "grey";
		count++;
	}
	
	public Cat (String newName, String newColor) {
		this.setName(newName);
		this.setColor(newColor);
		count++;
	}
	

	
	public static int getCount() {
		return count;
	}

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null || name != "") {
		this.name = name;
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color != null || color != "") {
			this.color = color;
			}
		
	}
	
	public void sayMiau() {
		System.out.printf("Cat %s said Miauuuuuuu!%n", name);
	}
	
}
