package com.timbuchalka;

public class Dog extends Animal{
	
	
	private int eyes;
	private int legs;
	private int tail;
	private int theeth;
	private String coat;

	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int theeth, String coat) {
		super(name,1,1, size, weight);
		
		this.eyes= eyes;
		this.legs= legs;
		this.tail=tail;
		this.theeth=theeth;
		this.coat=coat;
		
	}
	
	private void chew()
	{
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();

	}
	
	public void walk()
	{
		System.out.println("Dog.walk() called");
		move(5);
	}
	public void run()
	{
		System.out.println("Dog.runk() called");
		move(10);
	}
	
	
}
