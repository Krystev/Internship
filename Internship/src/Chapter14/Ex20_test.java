package Chapter14;

public class Ex20_test {

	public static void main(String[] args) {
		Ex20_School botev = new Ex20_School("Hristo Botev");
		Ex20_Students stud1 = new Ex20_Students("Petar Petrov", 1);
		Ex20_Specialty spec1 = new Ex20_Specialty("Math", 52, 48);
		Ex20_Teacher teach1 = new Ex20_Teacher("Georgi Ivanov");
		Ex20_SchoolClass class1 = new Ex20_SchoolClass("10A");

		teach1.addSpecialty(spec1);
		class1.addTeacher(teach1);
		class1.addStudent(stud1);
		botev.addStudent(stud1);
		botev.addClass(class1);

		System.out
				.println(botev.getAllStudents().size()
						+ " "
						+ class1.getStudents().get(0).getName()
						+ " "
						+ class1.getTeachers().get(0).getSpecialties().get(0)
								.getName());

	}

}
