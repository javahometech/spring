package in.javahome.springorm.entity;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private int id;
	private String name;
	private Double cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
}
