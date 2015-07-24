package Chapter14;

import java.util.ArrayList;
import java.util.List;

public class Ex20_School {
	private String schoolName;
	private List<Ex20_SchoolClass> classes;
	private List<Ex20_Students> allStudents;
	
	public Ex20_School(String schoolName) {
		
		this.setSchoolName(schoolName);
		this.classes = new ArrayList<>();
		this.allStudents = new ArrayList<>();
	}
	
	public void addClass(Ex20_SchoolClass class1) {
		this.classes.add(class1);
	}
	
	public void addStudent(Ex20_Students stud) {
		this.allStudents.add(stud);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Ex20_Students> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(List<Ex20_Students> allStudents) {
		this.allStudents = allStudents;
	}

	public List<Ex20_SchoolClass> getClasses() {
		return classes;
	}

	public void setClasses(List<Ex20_SchoolClass> classes) {
		this.classes = classes;
	}

}
