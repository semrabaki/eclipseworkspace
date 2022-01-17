package familyproject;

import java.util.ArrayList;
import java.util.List;

public class Wife extends Father {
	
	private String name;
	private String lastName;
	private boolean isHappy;
	
	List<Product> list= new ArrayList<>();
	private Requirement requirement;
	
	
	public Wife() {
		
	}


	public Wife(String name, String lastName, boolean isHappy, List<Product> list, Requirement requirement) {
		
		this.name = name;
		this.lastName = lastName;
		this.isHappy = isHappy;
		this.list = list;
		this.requirement = requirement;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public boolean isHappy() {
		return isHappy;
	}


	public void setHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}


	public List<Product> getList() {
		return list;
	}


	public void setList(List<Product> list) {
		this.list = list;
	}


	public Requirement getRequirement() {
		return requirement;
	}


	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}


	@Override
	public String toString() {
		return "Wife [name=" + name + ", lastName=" + lastName + ", isHappy=" + isHappy + ", list=" + list
				+ ", requirement=" + requirement + "]";
	}
	
	

}
