package Chapter14;

public class Ex20_Students {
	private String name;
	private int classNumber;
	
	public Ex20_Students(String name, int classNumber) {
		
		this.setName(name);
		this.setClassNumber(classNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
}
