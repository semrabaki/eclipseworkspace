package animalproject;

public abstract class Animal {
	
	protected String name;
	protected int age;
	protected String habitat;
	protected boolean isDomestic;
	
	
	
	
	
	public Animal() {		
	}
	
	
	public Animal(String name, int age, String habitat, boolean isDomestic) 
	{
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.isDomestic = isDomestic;
	}


	abstract String animalNAme();
	abstract int animalAge();
	abstract String animalHabitat();
	abstract boolean isDomestic();
	

}
