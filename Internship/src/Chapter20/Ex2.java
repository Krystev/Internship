package Chapter20;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		
		Ex1_Student[] students = new Ex1_Student[10];
		Random rnd = new Random();
		for (int i = 0; i < students.length; i++) {
			students[i] = new Ex1_Student("Ivo" + i, "Ivov" + i, rnd.nextInt(6));
			System.out.println(students[i].getRating());
		}
		
		
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].compareTo(students[i]) == 1){
					
					Ex1_Student temp = students[j ];
					students[j] = students[j + 1];
					students[j + 1] = temp;
					
				}
			}	
		}
		
		
		for (Ex1_Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getRating());
		}
		
	}

	

	

}
