package Chapter14;

import java.util.ArrayList;
import java.util.List;

public class Ex20_SchoolClass {
	private List<Ex20_Teacher> teachers;
	private List<Ex20_Students> students;
	private String classId;
	
	public Ex20_SchoolClass(String classId) {
		
		this.setClassId(classId);
		this.teachers = new ArrayList<>();
		this.students = new ArrayList<>();
	}
	
	public void addTeacher(Ex20_Teacher teach) {
		this.teachers.add(teach);
	}
	
	public void addStudent(Ex20_Students student){
		this.students.add(student);
	}

	public List<Ex20_Students> getStudents() {
		return students;
	}

	public void setStudents(List<Ex20_Students> students) {
		this.students = students;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public List<Ex20_Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Ex20_Teacher> teachers) {
		this.teachers = teachers;
	}
}
