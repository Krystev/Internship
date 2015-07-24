package Chapter14;

public class Ex20_Specialty {
	private String name;
	private int numberOfLessons;
	private int numberOfExercises;
	
	public Ex20_Specialty(String name, int numberOfLessons,
			int numberOfExercises) {
		
		this.setName(name);
		this.setNumberOfLessons(numberOfLessons);
		this.setNumberOfExercises(numberOfExercises);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLessons() {
		return numberOfLessons;
	}

	public void setNumberOfLessons(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}

	public int getNumberOfExercises() {
		return numberOfExercises;
	}

	public void setNumberOfExercises(int numberOfExercises) {
		this.numberOfExercises = numberOfExercises;
	}
}
