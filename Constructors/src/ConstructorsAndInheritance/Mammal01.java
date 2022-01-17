package ConstructorsAndInheritance;

public class Mammal01 extends Animal01 {
	
	
	
	public Mammal01(int age)
	{
		super();
		System.out.println("Child constructor by this...");
	}
	
	public Mammal01()
	{
		this(11);
		System.out.println("Child constructor....");
	}

}
