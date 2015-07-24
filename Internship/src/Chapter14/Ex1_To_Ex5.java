package Chapter14;

public class Ex1_To_Ex5 {
	private static int count = 0;

	private String name;
	private byte course;
	private String university;
	private String specialty;
	private String email;
	private String phone;

	public Ex1_To_Ex5(String name, byte course, String university, String specialty, String email,
			String phone) {
		
		this.setName(name);
		this.setCourse(course);
		this.setUniversity(university);
		this.setSpecialty(specialty);
		this.setEmail(email);
		this.setPhone(phone);
		count++;
	}

	public static int getCount() {
		return count;
	}

	public Ex1_To_Ex5() {
		this.setName(null);
		this.setCourse((byte) 0);
		this.setSpecialty(null);
		this.setEmail(null);
		this.setPhone(null);
		count++;
	}

	public void info() {

		System.out
				.printf("Student name: %s%nCourse: %s%University: %s%nSpecialty: %s%nE-mail: %s%nPhone Number: %s%n",
						this.name, this.course, this.university, this.specialty, this.email,
						this.phone);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public byte getCourse() {
		return course;
	}

	public void setCourse(byte course) {
		if (course > 0) {
			this.course = course;
		}
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		if (specialty != null) {
			this.specialty = specialty;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null) {
			this.email = email;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone != null) {
			this.phone = phone;
		}
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
}
