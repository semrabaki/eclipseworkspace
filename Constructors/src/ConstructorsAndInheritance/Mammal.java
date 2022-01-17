package ConstructorsAndInheritance;

public class Mammal extends Animal {
	
	public Mammal(int age)
	{
		super();
		
		System.out.println("Child constructor called by this()");
	}
	
	public Mammal()
	{
		this(11);
		System.out.println("Child Constructor...");
	}

}
