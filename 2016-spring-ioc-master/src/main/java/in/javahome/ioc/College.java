package in.javahome.ioc;

import java.util.Set;

public class College {
	private String name;
	private int noOfStudents;
	private Set<String> holidays;

	void showDetails() {
		System.out.println("Collenge Name " + name);
		System.out.println("No Of Students " + noOfStudents);
		System.out.println("Holidays");
		for (String h : holidays) {
			System.out.println(h);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public void setHolidays(Set<String> holidays) {
		this.holidays = holidays;
	}

}
