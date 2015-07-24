package Chapter14;

import java.util.ArrayList;
import java.util.List;

public class Ex20_Teacher {
	private String name;
	private List<Ex20_Specialty> specialties;
	
	public Ex20_Teacher(String name) {
		
		this.setName(name);
		this.setSpecialties(new ArrayList<>());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addSpecialty(Ex20_Specialty spec) {
		specialties.add(spec);
	}
	
	public List<Ex20_Specialty> getSpecialties() {
		return specialties;
	}
	public void setSpecialties(List<Ex20_Specialty> specialties) {
		this.specialties = specialties;
	}
}


