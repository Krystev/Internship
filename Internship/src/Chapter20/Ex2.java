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
		
		for (int i = 1; i < students.length; i++) {
			for (int j = students.length - 1; j >= i; j--) {
				if (students[j].compareTo(students[j-1]) == 1){
					Ex1_Student temp = students[j-1];
					students[j-1] = students[j];
					students[j] = temp;
				}
			}	
		}
		
		
		for (Ex1_Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getRating());
		}
		
	}

	

	

}
