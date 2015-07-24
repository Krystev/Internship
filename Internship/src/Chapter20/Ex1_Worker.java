package Chapter20;

public class Ex1_Worker extends Ex1_Human {

	private double salary;
	private int hoursWorked;

	public Ex1_Worker(String firstName, String lastName, double salary,
			int hoursWorked) {
		super(firstName, lastName);
		this.setSalary(salary);
		this.setHoursWorked(hoursWorked);
	}
	
	public double moneyPerHour() {
		return (this.getSalary() / this.getHoursWorked());
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
