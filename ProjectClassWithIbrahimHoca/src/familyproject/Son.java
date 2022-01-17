package familyproject;

import java.util.*;

public class Son extends Father{
	
	private String name;
	private String lastName;
	private boolean isHappy;
	
	private List<Product> list= new ArrayList<>();
	
	private Requirement requirment;

	public Son() {
		
	}

	public Son(String name, String lastName, boolean isHappy, List<Product> list, Requirement requirment) {
		
		this.name = name;
		this.lastName = lastName;
		this.isHappy = isHappy;
		this.list = list;
		this.requirment = requirment;
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

	public Requirement getRequirment() {
		return requirment;
	}

	public void setRequirment(Requirement requirment) {
		this.requirment = requirment;
	}

	@Override
	public String toString() {
		return "Son [name=" + name + ", lastName=" + lastName + ", isHappy=" + isHappy + ", list=" + list
				+ ", requirment=" + requirment + "]";
	}

	

}
