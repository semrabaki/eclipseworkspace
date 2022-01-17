package carproject;

public abstract class Car {
	
	protected String make;
	protected String model;
	protected int year;
	protected double price;
	
	
	
	
    public Car() {
		super();
		
	}
    
	public Car( String model, int year, double price) {
		super();
	
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	abstract String carMake();
    abstract String carModel();
	abstract int carYear();
	abstract double carPrice();
	
	static
	{
		System.out.println("The car is on the way!");
	}
	
	

}
