package Chapter20;

public class Ex1_Student extends Ex1_Human implements Comparable<Ex1_Student>{

	private double rating;
	
	public Ex1_Student(String firstName, String lastName, double rating) {
		super(firstName, lastName);
		this.setRating(rating);
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Ex1_Student stud) {
		
		if (this.getRating() < stud.getRating()) {
			return 1;
		} else if (this.getRating() == stud.getRating()) {
			return 0;
		}
		return -1;
	}

}
