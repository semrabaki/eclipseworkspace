package animalproject;

public class Cat  extends Animal{


	protected String name;
	protected int age;
	protected String habitat;
	protected boolean isDomestic;
	
	
	
	public Cat() {
	}
	

	public Cat(String name, int age, String habitat, boolean isDomestic) {
		super();
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.isDomestic = isDomestic;
	}


	@Override
	String animalNAme() {
		
		return this.name;
	}

	@Override
	int animalAge() {
		
		return this.age;
	}

	@Override
	String animalHabitat() {
		
		return this.habitat;
	}

	@Override
	boolean isDomestic() {
		
		return this.isDomestic;
	}

}
