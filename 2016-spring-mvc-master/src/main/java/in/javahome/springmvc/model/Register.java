package in.javahome.springmvc.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

public class Register {
	
	@Min(value=3,message="Nme should contain minium 3 chars")
	private String name;
	@NotNull(message="Course is Mandatory")
	@Range(min=3,max=10,message="Course name shoud contain min 3 and max 10 chars")
	private String course;
	
	@Pattern(regexp="[0-9]{10}")
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
